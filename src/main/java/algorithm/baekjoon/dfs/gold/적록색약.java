package algorithm.baekjoon.dfs.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class 적록색약 {

    private static char[] RGB = new char[]{'R','G','B'};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[][] grid = new char[n][n];
        for (int i = 0; i < n; ++i) {
            grid[i] = br.readLine().toCharArray();
        }


        int dyschromatopsia;
        int nomal;

        System.out.printf("%d %d", dyschromatopsia, nomal);
    }

    private static int answer(char[][] grid, int n) {
        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                dfs(j, i, grid, visited, RGB[]);
            }
        }
    }

    private static int dfs(int x, int y, char[][] grid, boolean[][] visited, char target) {
    }
}
