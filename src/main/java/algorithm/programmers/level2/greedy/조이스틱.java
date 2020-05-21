package algorithm.programmers.level2.greedy;

import java.util.ArrayList;
import java.util.List;

public class 조이스틱 {
    
    private static final int A_ASCII = 65;
    
    public int solution(String name) {
        char[] toChar = name.toCharArray();
        
        int answer = 0;
        for (int i = 0; i < toChar.length; i++) {
            char c = toChar[i];
            
            int charASCII = c;
            int upDownCurour = charASCII - A_ASCII;
            if (upDownCurour > 12) {
                upDownCurour = 26 - upDownCurour;
            }
            
            answer += upDownCurour;
        }
        
        int[] serialAIndex = getLongestSerialAIndex(toChar);
        
        int leftRightCursur = 0;
        
        if (serialAIndex[0] == 0 && serialAIndex[1] == 0) {
            leftRightCursur = toChar.length - 1;
        } else {
            int left = serialAIndex[0] == 0 ? 0 : serialAIndex[0] - 1;
            int right = toChar.length - serialAIndex[1];
            
            leftRightCursur = left > right ? (right * 2) + left : (left * 2) + right;
            leftRightCursur = leftRightCursur > toChar.length - 1 ? toChar.length - 1 : leftRightCursur;
        }
        
        answer += leftRightCursur ;
        
        return answer;
    }
    
    private int[] getLongestSerialAIndex(char[] array) {
        int count = 0;
        List<Serial> list = new ArrayList<Serial>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'A') {
                if (count == 0) {
                    list.add(new Serial(i, 1));
                } else {
                    list.get(list.size()-1).count = (count+1);
                }
                
                count++;
            } else {
                count = 0;
            }
        }
        
        int max = 0;
        Serial serial = new Serial();
        
        for (Serial s : list) {
            if (max <= s.count) {
                max = s.count;
                serial = s;
            }
        }
        
        int[] result = new int[2];
        result[0] = serial.index;
        result[1] = serial.index + serial.count;
        
        return result;
    }
    
    class Serial {
        
        private int index;
        private int count;
        
        public Serial() {}
        
        public Serial(int index, int count) {
            this.index = index;
            this.count = count;
        }
    }
}
