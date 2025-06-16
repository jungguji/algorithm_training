package algorithm.baekjoon.graph.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class 토마토 {
    private final static int[] dx = {0, 1, 0, -1};
    private final static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] MN = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int M = MN[0];
            int N = MN[1];

            Integer[][] date = new Integer[N][M];
            int[][] tomato = new int[N][M];

            for (int i = 0; i < N; i++) {
                tomato[i] = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }

            //solved
            Queue<int[]> queue = new ArrayDeque<>();
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < M; ++j) {
                    // 며칠 지나야 익게 되는지 최소 일수는 구하는거니까
                    // 날짜를 큰값으로 초기화 시켜놓음
                    date[i][j] = Integer.MAX_VALUE;

                    // 1인 애들이 토마토 든 위치이므로
                    // 토마토 현재 좌표를 저장하고
                    // 익는데 걸리는 시간(이미 익엇으니까 0)을 저장
                    if (tomato[i][j] == 1) {
                        queue.offer(new int[] {i, j});
                        date[i][j] = 0;
                    }
                }
            }

            while (!queue.isEmpty()) {
                int[] position = queue.poll();
                int x = position[0];
                int y = position[1];

                int i = 4;
                while (i-- > 0) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if ((nx < 0 || nx >= N) || (ny < 0 || ny >= M)) {
                        continue;
                    }

                    // 최소 일수 구하는거니까 이미 구한 일자보다
                    // 다음에 익을 날짜보다 더 이후면 저장힐 이유 없음
                    // visited 대체느낌
                    if ((date[nx][ny] <= date[x][y] + 1)) {
                        continue;
                    }

                    // 토마토 없는 곳이니깐 저장할필요 없음
                    if (tomato[nx][ny] == -1) {
                        continue;
                    }

                    queue.offer(new int[] {nx, ny});
                    // 하루 지나서 익는거니까 +1
                    date[nx][ny] = date[x][y] + 1;
                }
            }


            int answer = -1;
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < M; ++j) {
                    // -1인 곳은 토마토가 들어있지 않은 곳이니까 값을 비교할 이유가 없음
                    if (tomato[i][j] != -1) {
                        answer = Math.max(answer, date[i][j]);
                    }
                }
            }

            System.out.println(answer == Integer.MAX_VALUE ? -1 : answer);
        }
    }
}
