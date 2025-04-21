package algorithm.baekjoon.dp.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 평범한_배낭 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] NK = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int N = NK[0];
            int K = NK[1];

            int[] W = new int[N+1];
            int[] V = new int[N+1];

            for (int i=1; i <= N; i++) {
                int[] WV = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                W[i] = WV[0];
                V[i] = WV[1];
            }

            int[][] d = new int[N+1][K+1];

            for (int n = 1; n <= N; n++) {
                for (int k = 0; k <= K; k++) {
                    d[n][k] = d[n-1][k];

                    if (k - W[n] < 0) {
                        continue;
                    }

                    d[n][k] = Math.max(d[n][k], d[n-1][k-W[n]] + V[n]);
                }
            }

            System.out.println(d[N][K]);
        }
    }
}
