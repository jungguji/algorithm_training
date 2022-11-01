package algorithm.programmers.level3.dp;

public class TwoXn_타일링 {
    private static final long DIVISION = 1000000007;

    public int solution(int n) {
        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (int) ((dp[i - 1] + dp[i - 2]) % DIVISION);
        }

        int answer = dp[n];
        return answer;
    }
}
