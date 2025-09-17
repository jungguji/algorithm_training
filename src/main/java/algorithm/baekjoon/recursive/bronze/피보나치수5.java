package algorithm.baekjoon.recursive.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수5 {
    private static Long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new Long[N+3];
        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 1L;

        System.out.println(f(N));
    }

    private static long f(int n) {
        if (dp[n] != null) {
            return dp[n];
        }

        dp[n] = f(n-1) + f(n-2);

        return dp[n];
    }
}
