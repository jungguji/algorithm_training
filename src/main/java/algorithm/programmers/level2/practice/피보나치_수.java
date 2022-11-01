package algorithm.programmers.level2.practice;

public class 피보나치_수 {
    private static final int DIVIDE_NUMBER = 1234567;

    public int solution(int n) {
        int[] cache = new int[n + 1];

        cache[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            cache[i] = ((cache[i - 1]) % DIVIDE_NUMBER + (cache[i - 2]) % DIVIDE_NUMBER) % DIVIDE_NUMBER;
        }

        int answer = cache[n];
        return answer;
    }
}
