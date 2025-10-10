package algorithm.baekjoon.backtracking.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N과M4 {
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
    앞에 자리가 더 작거나 같아야함
    1 1
    1 2
    1 3
    1 4
    2 1 은 안돼
    왜 ? 1이 2보다 작으니까

     */
    private static void dfs(int 이전자리수값, int depth) {
        if (depth == M) {
            for (int i : array) {
                sb.append(i).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = 이전자리수값; i <= N; ++i) {
            array[depth] = i;

            dfs(i, depth+1);
        }
    }
}
