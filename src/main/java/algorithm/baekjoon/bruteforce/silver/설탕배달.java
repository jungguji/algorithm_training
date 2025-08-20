package algorithm.baekjoon.bruteforce.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N+1];

        for (int i = 1; i < dp.length; ++i) {
            if (i % 5 == 0) {
                dp[i] = dp[i-5] + 1;
                continue;
            }

            dp[i] = 5000;
        }

        dp[3] = 1;

        for (int i = 6; i <= N; ++i) {
            dp[i] = Math.min(dp[i-3], dp[i-5]) + 1;
        }

        System.out.println(dp[N] >= 5000 ? -1 : dp[N]);
    }
}
