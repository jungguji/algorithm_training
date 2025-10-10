package algorithm.baekjoon.backtracking.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N과M2_복습_0 {

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

        dfs(1, 0);

        System.out.println(sb);
    }

    /*
    이전에 사용한 숫자보다 커야하니 어디서부터 시작해야할지,
    어느자리까지 했는지,
     */
    private static void dfs(int start, int depth) {
        if (depth == M) {
            for (int i : array) {
                sb.append(i).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = start; i <= N; ++i) {

            array[depth] = i;
            dfs(i+1, depth+1);
        }
    }
}
