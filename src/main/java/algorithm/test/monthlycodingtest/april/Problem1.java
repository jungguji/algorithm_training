package algorithm.test.monthlycodingtest.april;

public class Problem1 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = getSign(absolutes[0], signs[0]);

        for (int i = 1; i < absolutes.length; i++) {
            answer += getSign(absolutes[1], signs[1]);
        }

        return answer;
    }

    private int getSign(int abs, boolean sign) {
        return abs * (sign ? 1 : -1);
    }
}
