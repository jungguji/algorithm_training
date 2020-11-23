package algorithm.baekjoon.class3.serach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 유기농_배추 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (testCase-- > 0) {
            int[] nmk = convertStringArrayToIntegerArray(br.readLine().split(" "));

            int[][] area = new int[nmk[0]][nmk[1]];

            while (nmk[2]-- > 0) {
                int[] xy = convertStringArrayToIntegerArray(br.readLine().split(" "));
                area[xy[0]][xy[1]] = 1;
            }

             sb.append(solution(area)).append("\n");
        }

        System.out.println(sb);
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }

    public static int solution(int[][] area) {
        boolean[][] isVisit = new boolean[area.length][area[0].length];

        int answer = 0 ;
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[0].length; j++) {
                if (area[i][j] == 0 || isVisit[i][j]) {
                    continue;
                }

                answer += bfs(area, isVisit, new int[] {i,j});
            }
        }
        return answer;
    }

    private static int bfs(int[][] area, boolean[][] isVisit, int[] xy) {
        Queue<int[]> queue = new LinkedList<>();

        setVisitAndQueue(isVisit, queue, xy[0], xy[1]);

        while (!queue.isEmpty()) {
            int[] x = new int[] {-1, 1, 0, 0};
            int[] y = new int[] {0, 0, 1, -1};
            int[] currentXY = queue.poll();

            for (int i = 0; i < x.length; i++) {
                int moveX = currentXY[0] + x[i];
                int moveY = currentXY[1] + y[i];

                if (moveX < 0 || moveY < 0 || moveY >= area[0].length || moveX >= area.length) {
                    continue;
                }

                if (isVisit[moveX][moveY] || area[moveX][moveY] == 0) {
                    continue;
                }

                setVisitAndQueue(isVisit, queue, moveX, moveY);
            }
        }

        return 1;
    }

    private static void setVisitAndQueue(boolean[][] isVisit, Queue<int[]> queue, int x, int y) {
        queue.offer(new int[] {x, y});
        isVisit[x][y] = true;
    }
}
