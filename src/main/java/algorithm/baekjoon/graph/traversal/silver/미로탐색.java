package algorithm.baekjoon.graph.traversal.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class 미로탐색 {
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // input
        int[] NM = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int N = NM[0];
        int M = NM[1];

        int[][] matrix = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            String line = br.readLine();
            for (int j = 1; j <= M; j++) {
                matrix[i][j] = line.charAt(j - 1) - '0';
            }
        }

        // solve
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[N + 1][M + 1];

        // bfs로 최단거리 구하기
        // 시작위치와 거리를 구해놓음 (문제에서 처음 시작 위치가 1,1임
        q.offer(new int[]{1, 1, 1}); // {y, x, distance}
        visited[1][1] = true;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int y = current[0];
            int x = current[1];
            int distance = current[2];

            // 종점에 도착
            if (y == N && x == M) {
                System.out.println(distance);
                return;
            }

            // 현재 위치에서 4면을 비교하면서 갈수 있는 곳인지 판단
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (
                    ny >= 1 && ny <= N // 다음 이동할 좌표 y가 미로를 벗어나지 않으면서
                    && nx >= 1 && nx <= M // 다음 이동할 좌표 x가 미로를 벗어나지 않으면서
                    && !visited[ny][nx] // 방문한적 없고 (미로 탈출해야하는데 이미 왔던길 다시 갈필요 없으니)
                    && matrix[ny][nx] == 1 // 갈수 있는 공간이라면, (0은 벽이라 못감)
                ) {
                    // 현재 위치에서 갈수 있는 길이 여러개라면
                    // 큐에 여러개 좌표가 다 들어감
                    // 그리고 해당 좌표부터 또 도는데
                    // 해당 좌표가 이동 불가능하다면 그 좌표에선 큐에 아무것도 넣지 못함
                    // 그리고 아까 여러개가 가능한 위치에서 넣었던 좌표부터 다시 시작하기 때문에
                    // dfs같은 백트레킹 없이도 가능
                    q.offer(new int[]{ny, nx, distance + 1}); // 그 위치로 전진하고 거리 증가(이동했은이까)
                    visited[ny][nx] = true;
                }
            }
        }

        System.out.println(-1);
    }
}
