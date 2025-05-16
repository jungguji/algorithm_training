package algorithm.baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Three타일링 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());

            int[][] dp = new int[N+1][3];

            dp[1][1] = 2;

            if (N > 1) {
                dp[2][0] = 2;
                dp[2][2] = 3;
            }

            for (int i = 3; i <= N; i++) {
                dp[i][0] = dp[i-1][1];
                dp[i][1] = (dp[i-1][2] * 2) + dp[i-1][0];
                dp[i][2] = dp[i-2][2] + dp[i][0];
            }

            System.out.println(dp[N][2]);
        }
    }
}
