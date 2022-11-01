package algorithm.baekjoon.class3.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Four_Squares {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(getInputData(System.in));

        System.out.println(solution(n));
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
        }
    }

    public static int solution(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, dp[i - j * j]);
            }

            dp[i] = min + 1;
        }

        return dp[n];
    }
}
