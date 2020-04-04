package algorithm.programmers.level1.practice;

public class 짝수와홀수 {

    public String solution(int num) {
        String answer = "Odd";
        if (num % 2 == 0) {
            answer = "Even";
        }
        return answer;
    }
}
