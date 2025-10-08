package algorithm.baekjoon.backtracking.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N과M2 {

    private static int N;
    private static int M;
    private static int[] array;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        N = NM[0];
        M = NM[1];
        array = new int[M];

        dfs(0, 1);

        System.out.println(sb);

    }

    private static void dfs(int depth, int start) {
        if (depth == M) {
            for (int i : array) {
                sb.append(i).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = start; i <= N; ++i) {
            array[depth] = i;

            dfs(depth+1, i+1);
        }
    }
}
