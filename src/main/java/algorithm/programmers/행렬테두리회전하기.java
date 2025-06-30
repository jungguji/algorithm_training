package algorithm.programmers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class 행렬테두리회전하기 {

    private static int[][] matrix;

    public int[] solution(int rows, int columns, int[][] queries) {
        // input
        matrix = new int[rows][columns];

        int count = 0;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                matrix[i][j] = ++count;
            }
        }

        int[] answer = new int[queries.length];
        IntStream.range(0, queries.length)
                .forEach(i -> answer[i] = test(queries[i]));

        return answer;
    }

    private static int test(int[] query) {
        final int x1 = query[0]-1;
        final int y1 = query[1]-1;
        final int x2 = query[2]-1;
        final int y2 = query[3]-1;


        Queue<Integer> queue = new LinkedList<>();
        queue.offer(matrix[x1][y1]);

        int min = Integer.MAX_VALUE;
        // 우로 이동
        for (int y = y1+1; y < y2+1; ++y) {
            queue.offer(matrix[x1][y]);
            matrix[x1][y] = queue.poll();
            min = Math.min(min, matrix[x1][y]);
        }

        // 아래로 이동
        for (int x = x1+1; x < x2+1; ++x) {
            queue.offer(matrix[x][y2]);
            matrix[x][y2] = queue.poll();
            min = Math.min(min, matrix[x][y2]);
        }

        // 좌로 이동
        for (int y = y2-1; y >= y1; --y) {
            queue.offer(matrix[x2][y]);
            matrix[x2][y] = queue.poll();
            min = Math.min(min, matrix[x2][y]);
        }

        // 위로 이동
        for (int x = x2-1; x >= x1; --x) {
            queue.offer(matrix[x][y1]);
            matrix[x][y1] = queue.poll();
            min = Math.min(min, matrix[x][y1]);
        }

        return min;
    }
}
