package algorithm.baekjoon.array.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 행렬덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int N = NM[0];
        int M = NM[1];
        int[][] A = new int[N][M];

        for (int i = 0; i < N; i++) {
            A[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = 0; j < M; ++j) {
                sb.append(A[i][j] + array[j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
