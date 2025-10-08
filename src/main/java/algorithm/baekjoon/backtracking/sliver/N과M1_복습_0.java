package algorithm.baekjoon.backtracking.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N과M1_복습_0 {

    private static int N;
    private static int M;
    private static boolean[] visited;
    private static int[] array;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        N = NM[0];
        M = NM[1];

        visited = new boolean[N+1];
        array = new int[M];

        dfs(0);

        System.out.println(sb);
    }

    /*
    탐색하다가 탐색한 노드의 숫자가 M만큼 됐으면
    출력
    근데 이미 했던애는 안해야되고
    다음 애로 넘어가야함
    근데 모든 애들에 대해서 순서 없이 다 들어가야되니까
    매번 반복해야함 0-m까지
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
            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            array[depth] = i;

            dfs(depth + 1);

            visited[i] = false;
        }
    }
}
