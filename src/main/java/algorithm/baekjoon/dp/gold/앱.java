package algorithm.baekjoon.dp.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 앱 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nm = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int N = nm[0];
            int M = nm[1];
            int[] memory = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] costs = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int limit = 0;
            for (int i : costs) {
                limit += i;
            }

            int[][] dp = new int[N+1][10001];

            for (int n = 1; n <= N; n++) {
                for (int c = 0; c <= limit; c++) {
                    dp[n][c] = dp[n-1][c];

                    if (c - costs[n-1] >= 0) {
                        dp[n][c] = Math.max(dp[n][c], dp[n-1][c - costs[n-1]] + memory[n-1]);
                    }

                    if (dp[n][c] >= M) {
                        break;
                    }
                }
            }

            int answer = Integer.MAX_VALUE;
            for (int c = 0; c <= limit; c++) {
                if (dp[N][c] >= M) {
                    answer = Math.min(answer, c);
                }
            }

            System.out.println(answer);
        }
    }
}
