package algorithm.programmers.level2.bruteforce;

import java.util.HashSet;
import java.util.Set;

public class 소수_찾기 {
    public int solution(String numbers) {
        char[] tochar = numbers.toCharArray();
        
        int numbersLength = tochar.length;
        
        Set<Integer> numberSet = new HashSet<Integer>();
        for (int i = 1; i <= numbersLength; i++) {
            perm(tochar, 0, i, numberSet);
        }
        
        int answer = getPrimeCount(numberSet);
        
        return answer;
    }
    
    private void perm(char[] array, int depth, int length, Set<Integer> numberSet) {
        if (depth == length) {
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                sb.append(array[i]);
            }
            
            int number = Integer.parseInt(sb.toString());
            if (number > 1) {
                numberSet.add(number);
            }
            
            return;
        }
        
        for (int i = depth; i < array.length; i++) {
            swap(array, i, depth);
            perm(array, depth + 1, length, numberSet);
            swap(array, i, depth);
        }
    }
    
    private void swap(char[] arrary, int i, int j) {
        char temp = arrary[i];
        arrary[i] = arrary[j];
        arrary[j] = temp;
    }
    
    private int getPrimeCount(Set<Integer> numberSet) {
        int result = 0;
        for (int i : numberSet) {
            boolean isPrime = true;
            
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                ++result;
            }
        }
        
        return result;
    }
}
