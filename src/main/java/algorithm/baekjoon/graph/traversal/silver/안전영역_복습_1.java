package algorithm.baekjoon.graph.traversal.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 안전영역_복습_1 {

    private static int[][] matrix;
    private static int N;
    private static int[] dx = new int[]{1, -1, 0, 0};
    private static int[] dy = new int[]{0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());

            matrix = new int[N][N];

            for (int i = 0; i < N; ++i) {
                matrix[i] = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }

            int max = 0;
            // 비가 안올수도 있음
            for (int i = 0; i <= 100; ++i) {
                boolean[][] visited = new boolean[N][N];

                int sum = 0;
                for (int y = 0; y < N; ++y) {
                    for (int x = 0; x < N; ++x) {
                        if (
                                visited[y][x]
                                || matrix[y][x] <= i
                        ) {
                            continue;
                        }

                        dfs(new int[]{y, x}, visited, i);
                        ++sum;
                    }
                }

                max = Math.max(max, sum);
            }

            System.out.println(max);
        }
    }

    private static void dfs(int[] position, boolean[][] visited, int 빗물_높이) {

        for (int i = 0; i < dx.length; ++i) {
            int nx = position[1] + dx[i];
            int ny = position[0] + dy[i];

            if (
                    (0 <= nx && nx < N)
                    && (0 <= ny && ny < N)
                    && (!visited[ny][nx])
                    && (matrix[ny][nx] > 빗물_높이)
            ) {
                visited[ny][nx] = true;
                dfs(new int[]{ny, nx}, visited, 빗물_높이);
            }
        }
    }
}
