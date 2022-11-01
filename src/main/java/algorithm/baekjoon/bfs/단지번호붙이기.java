package algorithm.baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 단지번호붙이기 {
    final static int[] TOP_BOT = new int[]{-1, 1, 0, 0};
    final static int[] LEFT_RIGHT = new int[]{0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[][] complex = new int[size][size];

        for (int i = 0; i < size; i++) {
            char[] tochar = br.readLine().toCharArray();

            for (int j = 0; j < size; j++) {
                complex[i][j] = tochar[j] - '0';
            }
        }

        int[] answers = solution(complex);
        for (int i : answers) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[][] complex) {
        boolean[][] passed = new boolean[complex.length][complex[0].length];

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < complex.length; i++) {
            for (int j = 0; j < complex[0].length; j++) {

                if (complex[i][j] == 0 || passed[i][j]) {
                    continue;
                }

                list.add(bfs(i, j, complex, passed));
            }
        }

        Collections.sort(list);

        int[] answers = new int[list.size() + 1];
        answers[0] = list.size();
        int i = 1;
        for (int idx : list) {
            answers[i++] = idx;
        }

        return answers;
    }

    private static int bfs(int x, int y, int[][] complex, boolean[][] passed) {
        Queue<Position> queue = new LinkedList<Position>();

        queue.offer(new Position(x, y));
        passed[x][y] = true;

        Queue<Integer> area = new LinkedList<Integer>();
        area.offer(1);
        int count = 1;
        while (!queue.isEmpty()) {
            Position current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int moveX = TOP_BOT[i] + current.x;
                int moveY = LEFT_RIGHT[i] + current.y;

                if (!isValidation(moveX, moveY, complex, passed)) {
                    continue;
                }

                queue.offer(new Position(moveX, moveY));
                passed[moveX][moveY] = true;
                count++;
            }
        }

        return count;
    }

    private static boolean isValidation(int moveX, int moveY, int[][] complex, boolean[][] passed) {
        if (isOutOfPicture(moveX, moveY, complex)) {
            return false;
        }

        if (complex[moveX][moveY] == 0) {
            return false;
        }

        if (passed[moveX][moveY]) {
            return false;
        }

        return true;
    }

    private static boolean isOutOfPicture(int moveX, int moveY, int[][] complex) {
        if (moveX < 0 || moveY < 0) {
            return true;
        }

        if (complex.length <= moveX || complex[0].length <= moveY) {
            return true;
        }

        return false;
    }

    static class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
