package algorithm.baekjoon.class2.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 마인크래프트 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nmb = convertStringArrayToIntegerArray(br.readLine().split(" "));

            int n = nmb[0];
            int m = nmb[1];

            int[][] ground = initGround(br, n, m);
            boolean[][] isPassed = new boolean[n][m];

            List<Block> blockList = getBlockList(n, m, ground, isPassed);

            int[] timeAndHigh = getMinimumConstructionTime(blockList, nmb[2]);

            System.out.println(timeAndHigh[0] + " " + timeAndHigh[1]);
        }
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }

    private static int[][] initGround(BufferedReader br, int n, int m) throws IOException {
        int[][] ground = new int[n][m];
        for (int i = 0; i < n; i++) {
            ground[i]= convertStringArrayToIntegerArray(br.readLine().split(" "));
        }

        return ground;
    }

    private static List<Block> getBlockList(int n, int m, int[][] ground, boolean[][] isPassed) {
        List<Block> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isPassed[i][j]) {
                    continue;
                }

                int count = breadthFirstSearch(i, j, ground, isPassed);

                list.add(new Block(ground[i][j], count));
            }
        }

        return list;
    }

    private static int breadthFirstSearch(int x, int y, int[][] picture, boolean[][] isPassed) {
        final int[] xAround = new int[]{1, -1, 0, 0};
        final int[] yAround = new int[]{0, 0, 1, -1};

        int areaRange = 1;

        Queue<Position> queue = new LinkedList<>();

        setPassedArea(isPassed, queue, x, y);

        while (!queue.isEmpty()) {
            Position currentPosition = queue.poll();

            for (int i = 0; i < xAround.length; i++) {
                int moveX = xAround[i] + currentPosition.x;
                int moveY = yAround[i] + currentPosition.y;

                if (!isSameAreaValidation(moveX, moveY, picture, isPassed, currentPosition)) {
                    continue;
                }

                setPassedArea(isPassed, queue, moveX, moveY);
                ++areaRange;
            }
        }

        return areaRange;
    }

    private static void setPassedArea(boolean[][] isPassed, Queue<Position> queue, int x, int y) {
        isPassed[x][y] = true;
        queue.offer(new Position(x, y));
    }

    private static boolean isSameAreaValidation(int moveX, int moveY, int[][] picture, boolean[][] isPassed, Position currentPosition) {
        if (isOutOfPicture(moveX, moveY, picture)) {
            return false;
        }

        if (isPassed[moveX][moveY]) {
            return false;
        }

        if (picture[currentPosition.x][currentPosition.y] != picture[moveX][moveY]) {
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

    private static int[] getMinimumConstructionTime(List<Block> blockList, int inventory) {
        int answerTime = Integer.MAX_VALUE;
        int answerHigh = 0;

        for (Block currentBlock : blockList) {
            int currentHigh = currentBlock.high;

            int up = 0;
            int down = 0;

            for (Block loopBlock : blockList) {
                int loopHigh = loopBlock.high;
                int loopCount = loopBlock.count;

                if (currentHigh > loopHigh) {
                    up += (currentHigh - loopHigh) * loopCount;
                } else if (currentHigh < loopHigh) {
                    down += (loopHigh - currentHigh) * loopCount;
                }
            }

            if (down + inventory >= up) {
                int time = (down * 2) + up;

                if (answerTime > time) {
                    answerTime = time;
                    answerHigh = currentBlock.high;
                }
            }
        }

        return new int[]{answerTime, answerHigh};
    }

    static class Block {
        private Integer high;
        private Integer count;

        public Block(Integer high, Integer count) {
            this.high = high;
            this.count = count;
        }
    }

    static class Position {
        private int x;
        private int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
