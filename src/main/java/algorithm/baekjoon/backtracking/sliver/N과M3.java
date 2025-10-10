package algorithm.baekjoon.backtracking.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N과M3 {

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

        dfs(0);

        System.out.println(sb);

    }

    /*
    쓴애 또 쓸수도 있고, 자기자신도 또 쓸수 있음
     */
    private static void dfs(int depth) {
        if (depth == M) {
            for (int i : array) {
                sb.append(i).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; ++i) {
            array[depth] = i;
            dfs(depth+1);
        }

    }
}
