package algorithm.programmers.level2.practice;

public class 나라의_숫자 {
    public String solution(int n) {
        String answer = "";
        while (n > 0) {
            String s = "";
            
            if (n % 3 == 0) {
                s = "4";
            } else if (n % 3 == 1) {
                s = "1";
            } else if (n % 3 == 2) {
                s = "2";
            }
            
            n = (n-1) / 3;
            
            answer = s + answer;
        }
        
        return answer;
    }
}
