package algorithm.baekjoon.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RGB거리 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            final int[][] homes = new int[n][n];

            for (int i = 0; i < n; i++) {
                homes[i] = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }

            int[][] dp = new int[n][n];
            dp[0][0] = homes[0][0];
            dp[0][1] = homes[0][1];
            dp[0][2] = homes[0][2];

            for (int i = 1; i < n; i++) {
                dp[i][0] = homes[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
                dp[i][1] = homes[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
                dp[i][2] = homes[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
            }

            System.out.println(Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
        }
    }
}
