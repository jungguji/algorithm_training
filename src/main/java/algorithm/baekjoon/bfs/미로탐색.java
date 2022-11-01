package algorithm.baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 미로탐색 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nAndm = br.readLine().split(" ");

        int n = Integer.parseInt(nAndm[0]);
        int m = Integer.parseInt(nAndm[1]);

        String[] row = new String[n];
        for (int i = 0; i < n; i++) {
            row[i] = br.readLine();
        }

        int[][] maze = getMazeArray(n, m, row);

        int answer = solution(n, m, maze);
        System.out.println(answer);
    }

    private static int[][] getMazeArray(int n, int m, String[] row) {
        int[][] maze = new int[n][m];

        for (int i = 0; i < n; i++) {
            char[] tochar = row[i].toCharArray();
            for (int j = 0; j < m; j++) {
                maze[i][j] = tochar[j] - '0';
            }
        }

        return maze;
    }

    public static int solution(int n, int m, int[][] maze) {
        boolean[][] isPassedPosition = new boolean[n][m];

        final int[] xAround = new int[]{-1, 1, 0, 0};
        final int[] yAround = new int[]{0, 0, -1, 1};

        Queue<Position> queue = new LinkedList<Position>();
        queue.offer(new Position(0, 0));

        isPassedPosition[0][0] = true;
        Queue<Integer> moves = new LinkedList<Integer>();
        moves.offer(1);
        int count = 0;

        while (true) {
            Position currentPosition = queue.poll();
            count = moves.poll();
            if (currentPosition.x == n - 1 && currentPosition.y == m - 1) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                int moveX = xAround[i] + currentPosition.x;
                int moveY = yAround[i] + currentPosition.y;

                if (!isPassedLoadValidation(moveX, moveY, maze, isPassedPosition)) {
                    continue;
                }

                queue.offer(new Position(moveX, moveY));
                isPassedPosition[moveX][moveY] = true;
                moves.offer(count + 1);
            }
        }

        return count;
    }

    private static boolean isPassedLoadValidation(int moveX, int moveY, int[][] maze, boolean[][] isPassedArea) {
        if (isOutOfPicture(moveX, moveY, maze)) {
            return false;
        }

        if (maze[moveX][moveY] == 0) {
            return false;
        }

        if (isPassedArea[moveX][moveY]) {
            return false;
        }

        return true;
    }

    private static boolean isOutOfPicture(int moveX, int moveY, int[][] picture) {
        if (moveX < 0 || moveY < 0) {
            return true;
        }

        if (picture.length <= moveX || picture[0].length <= moveY) {
            return true;
        }

        return false;
    }

    static class Position {
        public int x;
        public int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
