package algorithm.baekjoon.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RGD거리_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] matrix = new int[N + 1][3];

        for (int i = 1; i <= N; ++i) {
            matrix[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        for (int i = 1; i <= N; ++i) {
            matrix[i][0] += Math.min(matrix[i-1][1], matrix[i-1][2]);
            matrix[i][1] += Math.min(matrix[i-1][0], matrix[i-1][2]);
            matrix[i][2] += Math.min(matrix[i-1][0], matrix[i-1][1]);
        }

        System.out.println(Math.min(Math.min(matrix[N][0], matrix[N][1]), matrix[N][2]));
    }
}