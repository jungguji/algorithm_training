package algorithm.baekjoon.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 이동하기_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int N = NM[0];
        int M = NM[1];

        int[][] matrix = new int[N + 1][M + 1];
        for (int i = 1; i <= N; ++i) {
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = 1; j <= M; ++j) {
                matrix[i][j] = array[j-1];
            }
        }

        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= M; ++j) {
                matrix[i][j] += Math.max(Math.max(matrix[i-1][j], matrix[i][j-1]), matrix[i-1][j-1]);
            }
        }

        System.out.println(matrix[N][M]);

    }
}
