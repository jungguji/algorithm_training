package algorithm.baekjoon.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two_X_N_타일링 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            int[] dp = new int[n+1];

            switch (n) {
                case 1:
                    dp[0] = 0;
                    dp[1] = 1;
                    break;
                default:
                    dp[0] = 0;
                    dp[1] = 1;
                    dp[2] = 2;
            }

            for (int i = 3; i <= n; i++) {
                dp[i] = (dp[i-1] + dp[i-2]) % 10007;
            }

            System.out.println(dp[n]);
        }
    }
}
