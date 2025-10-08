package algorithm.baekjoon.backtracking.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N과M1 {
    private static boolean[] visited;
    private static int N;
    private static int M;
    public static int[] arr;

    private static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        N = NM[0];
        M = NM[1];

        arr = new int[M];

        visited = new boolean[N+1];

        dfs(0);


        System.out.println(sb);
    }

    private static void dfs(int depth) {
        if (depth == M) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; ++i) {
            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            arr[depth] = i ;

            dfs(depth+1);

            visited[i] = false;
        }
    }
}
