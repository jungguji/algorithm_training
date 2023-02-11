package algorithm.baekjoon.dfs.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 적록색약 {

    private final static int[] dx = new int[]{0, 0, -1, 1};
    private final static int[] dy = new int[]{-1, 1, 0, 0};

    /**
     * 2번 도는데
     * R 한번 우, 하로 한칸씩 이동하면서 true 만나면 +1
     * G 한번 우, 하로 한칸씩 이동하면서 true 만나면 +1
     * B 한번 우, 하로 한칸씩 이동하면서 true 만나면 +1
     * 해서 보통사람 개수 구하고
     * RG 한번 우, 하로 한칸씩 이동하면서 true 만나면 +1
     * B 한번 우, 하로 한칸씩 이동하면서 true 만나면 +1
     * 해서 적녹색약 개수 구하고
     * 두개 리턴하면 끝
     * 인데 안 느리려나?
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[][] grid = getGrid(br, n);

        boolean[][] visited = new boolean[n][n];

        int normal = getCount(n, grid, visited);

        visited = new boolean[n][n];
        changeGToR(n, grid);

        int dyschromatopsia = getCount(n, grid, visited);

        System.out.printf("%d %d", normal, dyschromatopsia);
    }

    private static char[][] getGrid(BufferedReader br, int n) throws IOException {
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; ++i) {
            grid[i] = br.readLine().toCharArray();
        }

        return grid;
    }

    private static int getCount(int n, char[][] grid, boolean[][] visited) {
        int answer = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (!visited[i][j]) {
                    dfs(i, j, grid, visited, n);
                    ++answer;
                }
            }
        }
        return answer;
    }

    private static void dfs(int x, int y, char[][] grid, boolean[][] visited, int n) {
        visited[x][y] = true;

        for (int i = 0; i < 4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(n, nx) || isRange(n, ny)) {
                continue;
            }

            if (!visited[nx][ny] && grid[x][y] == grid[nx][ny]) {
                dfs(nx, ny, grid, visited, n);
            }
        }
    }

    private static boolean isRange(int limit, int index) {
        return index < 0 || index >= limit;
    }

    private static void changeGToR(int n, char[][] grid) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 'G') {
                    grid[i][j] = 'R';
                }
            }
        }
    }
}
