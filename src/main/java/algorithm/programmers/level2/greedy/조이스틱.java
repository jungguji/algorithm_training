package algorithm.programmers.level2.greedy;

import java.util.ArrayList;
import java.util.List;

public class 조이스틱 {
    
    private static final int A_ASCII = 65;
    
    public int solution(String name) {
        char[] toChar = name.toCharArray();
        
        int answer = getUpDownCount(toChar);
        
        int[] serialIndex = getLongestSerialIndex(toChar);
        
        int leftRightCursur = getLeftRightCount(serialIndex[0], serialIndex[1], toChar.length);
        
        answer += leftRightCursur;
        
        return answer;
    }

    private int getUpDownCount(char[] names) {
        int count = 0;
        for (char c : names) {
            int upDownCurour = c - A_ASCII;
            if (upDownCurour > 12) {
                upDownCurour = 26 - upDownCurour;
            }

            count += upDownCurour;
        }

        return count;
    }
    
    private int[] getLongestSerialIndex(char[] array) {
        List<Serial> list = getSerialList(array);
        
        Serial serial = getMaxCountSerial(list);
        
        int[] result = new int[2];
        result[0] = serial.index;
        result[1] = serial.index + serial.count;
        
        return result;
    }

    private List<Serial> getSerialList(char[] array) {
        int count = 0;
        List<Serial> list = new ArrayList<Serial>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 'A') {
                count = 0;
                continue;
            }

            if (count == 0) {
                list.add(new Serial(i, 1));
            } else {
                list.get(list.size()-1).count = (count+1);
            }

            count++;
        }

        return list;
    }

    private Serial getMaxCountSerial(List<Serial> list) {
        int max = 0;
        Serial serial = new Serial();

        for (Serial s : list) {
            if (max <= s.count) {
                max = s.count;
                serial = s;
            }
        }

        return serial;
    }

    private int getLeftRightCount(int serialIndex, int serialCount, int nameLength) {
        int leftRightCursur = 0;

        if (serialIndex == 0 && serialCount == 0) {
            leftRightCursur = nameLength - 1;
        } else {
            int left = serialIndex == 0 ? 0 : serialIndex - 1;
            int right = nameLength - serialCount;

            leftRightCursur = left > right ? (right * 2) + left : (left * 2) + right;
            leftRightCursur = leftRightCursur > nameLength - 1 ? nameLength - 1 : leftRightCursur;
        }

        return leftRightCursur;
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
