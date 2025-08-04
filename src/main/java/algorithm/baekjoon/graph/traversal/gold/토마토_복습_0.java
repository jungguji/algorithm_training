package algorithm.baekjoon.graph.traversal.gold;

import java.util.*;
import java.io.*;

public class 토마토_복습_0 {
    private static int[] dx = new int[]{1, -1, 0, 0};
    private static int[] dy = new int[]{0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] MN = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int M = MN[0];
        int N = MN[1];

        int[][] matrix = new int[N][M];
        boolean[][] visited = new boolean[N][M];

        List<int[]> start_nodes = new ArrayList<>();

        for (int i = 0; i < N; ++i) {
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = 0; j < M; ++j) {
                matrix[i][j] = array[j];

                if (array[j] == 1) {
                    start_nodes.add(new int[]{i, j});
                }
            }
        }

        // solved
        Queue<int[]> queue = new LinkedList<>();

        for (int[] yx : start_nodes) {
            queue.offer(new int[]{yx[0], yx[1], 0});
            visited[yx[0]][yx[1]] = true;
        }

        int max = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int y = current[0];
            int x = current[1];
            int date = current[2];

            max = Math.max(max, date);

            for (int i = 0; i < dx.length; ++i) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (
                    (0 <= ny && ny < N)
                    && (0 <= nx && nx < M)
                    && (matrix[ny][nx] != -1)
                    && (!visited[ny][nx])
                ) {
                    queue.offer(new int[]{ny, nx, date+1});
                    visited[ny][nx] = true;
                    matrix[ny][nx] = 1;
                }
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(max);
    }
}
