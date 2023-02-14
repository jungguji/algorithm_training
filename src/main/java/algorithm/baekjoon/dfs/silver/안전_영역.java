package algorithm.baekjoon.dfs.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 안전_영역 {
    /**
     * 지형의 높이는 n은 1 <= n <= 100 이고
     * 비는 0 <= x <= 100 이다.
     *
     * 안전한 영역의 최대 개수
     *
     * 비가 0부터 n까지 온다고 가정하고 n까지 루프 돌아야함
     *
     * 돌면서 dfs로 서치하는데 끊기거나, 끝까지 가면 1 리턴해서
     * Math.max(max, answer) 해서 최대값 저장하고
     * 리턴하면 끝... 일듯?
     *
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] grid = getGrid(br, n);
    }

    private static int[][] getGrid(BufferedReader br, int n) throws IOException {
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; ++i) {
            grid[i] = convertStringArrayToIntegerArray(br.readLine().split(" "));
        }

        return grid;
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }

}
