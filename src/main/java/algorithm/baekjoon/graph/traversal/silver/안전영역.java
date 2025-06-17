package algorithm.baekjoon.graph.traversal.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 안전영역 {
    private final static int[] dx = new int[]{0, 0, -1, 1};
    private final static int[] dy = new int[]{-1, 1, 0, 0};
    private static int N;
    private static int[][] area;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());

            area = new int[N+1][N+1];

            for (int i = 0 ; i < N; i++) {
                area[i] = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }

            int max = 1;
            int min = 100;
            for (int i = 0; i < N; i++) {
                for (int ii = 0; ii < N; ii++) {
                    max = Math.max(max, area[i][ii]);
                    min = Math.min(min, area[i][ii]);
                }
            }

            int answer = 0;
            while (max-- > min-1) {
                answer = Math.max(answer, 가져온다_안전영역의갯수(max));
            }

            System.out.println(answer);
        }
    }

    private static int 가져온다_안전영역의갯수(int 현재_빗물_높이) {
        boolean[][] visited = new boolean[N+1][N+1];

        int answer = 0;
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {

                // dfs 끝나고 나오면 해당 위치에서 연결된 영역을 다 연결하고 나온거니까
                // 안전영역 + 1함
                // 모든 영역에서 시작해보면서 하는거 아래 조건처럼 갔던 곳이나 이미 잠긴곳은 할필요 없음 ㅋ
                if (!visited[y][x] && area[y][x] > 현재_빗물_높이) {
                    dfs(y, x, 현재_빗물_높이, visited);
                    ++answer;
                }
            }
        }

        return answer;
    }

    private static void dfs(int y, int x, int 현재_빗물_높이, boolean[][] visited) {

        // 돌다가 영역 범위 벗어나면 아웃
        if ((y < 0 || y >= N) || (x < 0 || x >= N)) {
            return;
        }

        // 돌다가 영역을 방문했거나 빗물보다 낮은 곳이면 아웃 (안전영역이 아니니까)
        if (visited[y][x] || area[y][x] <= 현재_빗물_높이) {
            return;
        }

        visited[y][x] = true;

        int i = 4;

        while (i-- > 0) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            dfs(nextY, nextX, 현재_빗물_높이, visited);
        }
    }
}
