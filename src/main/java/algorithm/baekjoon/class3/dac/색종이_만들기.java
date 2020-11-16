package algorithm.baekjoon.class3.dac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 색종이_만들기 {
    public static final String WHITE = "white";
    public static final String BLUE = "blue";

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());
            int n = amount;
            int[][] board = new int[amount + 1][amount + 1];

            int i = 0;
            while (amount-- > 0) {
                int[] xy = convertStringArrayToIntegerArray(br.readLine().split(" "));
                board[i++] = xy;
            }

            int[] answer = solution(n, board);

            System.out.printf("%d \n%d", answer[0], answer[1]);
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

    public static int[] solution(int n, int[][] board) {
        Map<String, Integer> map = new HashMap<>();
        map.put(WHITE, 0);
        map.put(BLUE, 0);

        dac(n, 0, 0, board, map);

        return new int[] {map.get(WHITE), map.get(BLUE)};
    }

    private static void dac(int n, int x, int y, int[][] board, Map<String, Integer> map) {
        int blueBoard = 0;
        for (int i = x; i < x + n; i++) {
           for (int j = y; j < y + n; j++) {
               if (board[i][j] == 1) {
                   ++blueBoard;
               }
           }
        }

        if (blueBoard == n * n) {
            map.put(BLUE, map.get(BLUE) + 1);
        } else if (blueBoard == 0) {
            map.put(WHITE, map.get(WHITE) + 1);
        } else {
            int div = n / 2;

            dac(div, x, y, board, map);
            dac(div, x, y + div, board, map);
            dac(div, x + div, y, board, map);
            dac(div, x + div, y + div, board, map);
        }
    }
}
