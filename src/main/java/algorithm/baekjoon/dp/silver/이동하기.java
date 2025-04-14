package algorithm.baekjoon.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 이동하기 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            final int[] NM = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int N = NM[0];
            int M = NM[1];

            int[][] miro = getMiro(N, M, br);
            int[][] dp = initDP(N, M, miro);
            cal(N, M, dp, miro);

            System.out.println(dp[N][M]);
        }
    }

    private static void cal(int N, int M, int[][] dp, int[][] miro) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                dp[i][j] = miro[i][j] + Math.max(Math.max(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);
            }
        }
    }

    private static int[][] initDP(int N, int M, int[][] miro) {
        int[][] dp = new int[N +1][M +1];

        dp[1][1] = miro[1][1];

        for (int i = 2; i <= N; i++) {
            dp[i][1] = miro[i][1] + dp[i-1][1];
        }

        for (int i = 2; i <= M; i++) {
            dp[1][i] = miro[1][i] + dp[1][i-1];
        }
        return dp;
    }

    private static int[][] getMiro(int N, int M, BufferedReader br) throws IOException {
        int[][] miro = new int[N +1][M +1];

        for (int i = 1; i <= N; i++) {
            int[] currentLine = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = 1; j <= M; j++) {
                miro[i][j] = currentLine[j-1];
            }
        }
        return miro;
    }
}
