package algorithm.baekjoon.dfs.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    private final static int[] dx = new int[]{0, 0, -1, 1};
    private final static int[] dy = new int[]{-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] grid = getGrid(br, n);

        int[] rains = getMaxAndMin(n, grid);

        int max = rains[0];
        int min = rains[1];

        int answer = 0;
        while (max-- > min-1) {
            boolean[][] visited = new boolean[n][n];
            int solution = solution(grid, visited, max);
            answer = Math.max(answer, solution);
        }

        System.out.println(answer);
    }

    private static int[][] getGrid(BufferedReader br, int n) throws IOException {
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; ++i) {
            grid[i] = convertStringArrayToIntegerArray(br.readLine().split(" "));
        }

        return grid;
    }

    private static int[] getMaxAndMin(int n, int[][] grid) {
        int max = 1;
        int min = 100;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                max = Math.max(max, grid[i][j]);
                min = Math.min(min, grid[i][j]);
            }
        }
        return new int[]{max, min};
    }

    private static int solution(int[][] grid, boolean[][] visited, int rain) {
        int n = grid.length;
        int answer = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (!visited[i][j] && grid[i][j] > rain) {
                    dfs(j, i, grid, visited, rain);
                    ++answer;
                }
            }
        }
        return answer;
    }

    private static void dfs(int x, int y, int[][] grid, boolean[][] visited, int rain) {
        int n = grid.length;
        visited[y][x] = true;

        for (int i = 0; i < 4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(n, nx) || isRange(n, ny)) {
                continue;
            }

            if (!visited[ny][nx] && grid[ny][nx] > rain) {
                dfs(nx, ny, grid, visited, rain);
            }
        }
    }

    private static boolean isRange(int limit, int index) {
        return index < 0 || index >= limit;
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
