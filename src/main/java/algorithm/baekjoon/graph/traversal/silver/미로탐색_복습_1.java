package algorithm.baekjoon.graph.traversal.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 미로탐색_복습_1 {
    private static final int[] DX = new int[]{1, -1, 0, 0};
    private static final int[] DY = new int[]{0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // input
        int[] NM = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int N = NM[0];
        int M = NM[1];

        // 좌표는 1,1 부터 시작함
        // 1-based
        // index는 0-based
        int[][] matrix = new int[N+1][M+1];
        boolean[][] visited = new boolean[N+1][M+1];

        for (int i = 1; i <= N; ++i) {
            int[] array = Arrays.stream(br.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int ii = 1; ii <= M; ++ii) {
                matrix[i][ii] = array[ii-1];
            }
        }

        // solved
        Queue<int[]> queue = new LinkedList<>();
        // 시작 좌표 + 해당 좌표 도달할 때까지 움직인 수
        queue.offer(new int[]{1, 1, 1});
        visited[1][1] = true;

        int answer = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[1];
            int y = current[0];
            int move = current[2];

            if (x == M && y == N) {
                answer = move;
            }

            for (int i = 0; i < DX.length; ++i) {
                int nx = x + DX[i];
                int ny = y + DY[i];

                // 이동할수 있는지 판단
                if (
                    (nx >= 1 && ny >= 1) // 1-based니까 1 이상이어야함
                    && (nx <= M && ny <= N) // 배열 벗어나면 당연히 안됨
                    && (matrix[ny][nx] != 0) // 0이면 막힌길
                    && (!visited[ny][nx]) // 이미 지니간길 아니면
                ) {
                    queue.offer(new int[]{ny, nx, move+1});
                    visited[ny][nx] = true;
                }
            }
        }

        System.out.println(answer);
    }
}
