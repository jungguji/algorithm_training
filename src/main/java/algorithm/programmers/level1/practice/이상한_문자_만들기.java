package algorithm.programmers.level1.practice;

public class 이상한_문자_만들기 {

    public String solution(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        
        int splitIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == ' ') {
                splitIndex = 0;
                continue;
            }
            
            if (splitIndex % 2 == 0) {
                if (ch >= 97 && ch <= 122) {
                    chars[i] = (char) (ch - 32);
                }
            }
            
            ++splitIndex;
        }
        
        return String.valueOf(chars);
    }
}
