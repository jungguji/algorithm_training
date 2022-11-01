package algorithm.programmers.level1.practice;

public class 가운데_글자_가져오기 {
    public String solution(String s) {
        String answer = s.substring((s.length() - 1) / 2, (s.length() / 2) + 1);
        return answer;
    }
}
