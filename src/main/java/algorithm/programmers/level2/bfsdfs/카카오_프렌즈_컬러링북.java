package algorithm.programmers.level2.bfsdfs;

import java.util.LinkedList;
import java.util.Queue;

public class 카카오_프렌즈_컬러링북 {
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        boolean[][] isPassedArea = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (picture[i][j] == 0 || isPassedArea[i][j]) {
                    continue;
                }

                int areaRange = breadthFirstSearch(i, j, picture, isPassedArea);
                maxSizeOfOneArea = (maxSizeOfOneArea < areaRange) ? areaRange : maxSizeOfOneArea;
                ++numberOfArea;
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        return answer;
    }

    private int breadthFirstSearch(int x, int y, int[][] picture, boolean[][] isPassedArea) {
        final int[] xAround = new int[]{1, -1, 0, 0};
        final int[] yAround = new int[]{0, 0, 1, -1};

        int areaRange = 1;

        Queue<Position> queue = new LinkedList<Position>();

        setPassedArea(isPassedArea, queue, x, y);

        while (!queue.isEmpty()) {
            Position currentPosition = queue.poll();

            for (int i = 0; i < xAround.length; i++) {
                int moveX = xAround[i] + currentPosition.x;
                int moveY = yAround[i] + currentPosition.y;

                if (!isSameAreaValidation(moveX, moveY, picture, isPassedArea, currentPosition)) {
                    continue;
                }

                setPassedArea(isPassedArea, queue, moveX, moveY);
                ++areaRange;
            }
        }

        return areaRange;
    }

    private boolean isSameAreaValidation(int moveX, int moveY, int[][] picture, boolean[][] isPassedArea, Position currentPosition) {
        if (isOutOfPicture(moveX, moveY, picture)) {
            return false;
        }

        if (picture[moveX][moveY] == 0) {
            return false;
        }

        if (isPassedArea[moveX][moveY]) {
            return false;
        }

        if (picture[currentPosition.x][currentPosition.y] != picture[moveX][moveY]) {
            return false;
        }

        return true;
    }

    private boolean isOutOfPicture(int moveX, int moveY, int[][] picture) {
        if (moveX < 0 || moveY < 0) {
            return true;
        }

        if (picture.length <= moveX || picture[0].length <= moveY) {
            return true;
        }

        return false;
    }

    private void setPassedArea(boolean[][] isPassedArea, Queue<Position> queue, int x, int y) {
        isPassedArea[x][y] = true;
        queue.offer(new Position(x, y));
    }

    class Position {
        private int x = 0;
        private int y = 0;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
