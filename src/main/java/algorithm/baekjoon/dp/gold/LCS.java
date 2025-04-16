package algorithm.baekjoon.dp.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char[] S1 = br.readLine().toCharArray();
            char[] S2 = br.readLine().toCharArray();

            int s1Length = S1.length;
            int s2Length = S2.length;
            int[][] dp = new int[s1Length +1][s2Length +1];

            for (int i = 1; i <= s1Length; i++) {
                for (int j = 1; j <= s2Length; j++) {
                    if (S1[i-1] == S2[j-1]) {
                        dp[i][j] = dp[i-1][j-1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    }
                }
            }

            System.out.println(dp[s1Length][s2Length]);
        }
    }
}
