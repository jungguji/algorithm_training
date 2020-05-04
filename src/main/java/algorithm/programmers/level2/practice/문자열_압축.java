package algorithm.programmers.level2.practice;

public class 문자열_압축 {
    public int solution(String s) {
        int stringLength = s.length();
        
        StringBuilder result = new StringBuilder();
        String origin = new String();
        char[] tochar = s.toCharArray();
        int min = Integer.MAX_VALUE;
        
        for (int i = 1; i <= stringLength / 2; i++) {
            int compression = 1;
            result.setLength(0);
            origin = new String(tochar, 0, i);
            
            String nextWord = new String();
            for (int j = i; j < stringLength; j+=i) {
                if (j + i > stringLength) {
                    nextWord = s.substring(j, stringLength);
                } else {
                    nextWord = new String(tochar, j , i);
                }
                
                if (origin.equals(nextWord)) {
                    ++compression;
                } else {
                    if (compression != 1) {
                        result.append(compression);
                    }
                    
                    result.append(origin);
                    
                    origin = nextWord.toString();
                    compression = 1;
                }
            }
            
            if (compression != 1) {
                result.append(compression);
            }
            
            result.append(origin);
            
            if (min > result.length()) {
                min = result.length();
            }
        }
        
        int answer = min > stringLength ? stringLength : min;
        return answer;
    }
}
