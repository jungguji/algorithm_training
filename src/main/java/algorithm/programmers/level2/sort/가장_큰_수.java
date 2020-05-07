package algorithm.programmers.level2.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 가장_큰_수 {
    public String solution(int[] numbers) {
        
        List<Numbers> list = new ArrayList<Numbers>();
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            
            char[] str = String.valueOf(number).toCharArray();
            StringBuilder fourDigitString = new StringBuilder();
            
            fourDigitString.append(str);
            if (str.length < 4) {
                
                for (int j = 0; j < 4 - str.length; j++) {
                    fourDigitString.append(str[((j) % str.length)]);
                }
            }
            
            list.add(new Numbers(i, Integer.parseInt(fourDigitString.toString())));
        }
        
        Collections.sort(list, new Comparator<Numbers>() {

            @Override
            public int compare(Numbers o1, Numbers o2) {
                return o2.value.compareTo(o1.value);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (Numbers n : list) {
            sum += n.value;
            sb.append(numbers[n.postion]);
        }
        
        if (sum == 0) {
            sb.setLength(0);
            sb.append(0);
        }
        
        return sb.toString();
    }
    
    class Numbers {
        public Integer postion;
        public Integer value;
        
        public Numbers(Integer postion, Integer value) {
            this.postion = postion;
            this.value = value;
        }
    }
}
