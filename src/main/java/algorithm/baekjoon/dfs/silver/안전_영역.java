package algorithm.baekjoon.dfs.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class 안전_영역 {
    /**
     *  1 <= 지형의 높이 <= 100 이고
     * 비는 0 <= x <= 100 이다.
     *
     * 안전한 영역의 최대 개수
     *
     * 비가 0부터 지형중 가장 높은 곳 까지 온다고 가정하고 max 높이까지 루프 돌아야함
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

        int rain = getMax(n, grid);

        int answer = 0;
//        while (rain-- > 0) {
            boolean[][] visited = new boolean[n][n];
            answer = Math.max(answer, solution(grid, visited, 4));
//        }

        System.out.println("answer = " + answer);
    }

    private static int[][] getGrid(BufferedReader br, int n) throws IOException {
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; ++i) {
            grid[i] = convertStringArrayToIntegerArray(br.readLine().split(" "));
        }

        return grid;
    }

    private static int getMax(int n, int[][] grid) {
        int max = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }

    private static int solution(int[][] grid, boolean[][] visited, int rain) {
        int n = grid.length;
        int answer = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (dfs(j, i, grid, visited, rain)) {
                    System.out.printf("%d %d\n", i, j);
                    ++answer;
                }
            }
        }
        return answer;
    }

    private static boolean dfs(int x, int y, int[][] grid, boolean[][] visited, int rain) {
        int n = grid.length;

        if (x == n || y == n) {
            return false;
        }

        if (grid[y][x] <= rain) {
            return false;
        }

        if (visited[y][x]) {
            return false;
        }

        visited[y][x] = true;

        if (grid[y][x] > rain && (x == n - 1 || grid[y][x + 1] > rain)) {
            dfs(x + 1, y, grid, visited, rain);
        }

        if (grid[y][x] > rain && (y == n - 1 || grid[y + 1][x] > rain)) {
            dfs(x, y + 1, grid, visited, rain);
        }

        return true;
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
