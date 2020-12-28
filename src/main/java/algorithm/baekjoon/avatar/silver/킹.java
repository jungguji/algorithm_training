package algorithm.baekjoon.avatar.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 킹 {
    private static int[][] board = new int[8][8];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] kingStoneN = br.readLine().split(" ");

        String[] king = kingStoneN[0].split("");
        String[] stone = kingStoneN[1].split("");

        int[] kingPosition = setPosition(king);
        int[] stonePosition = setPosition(stone);

        int n = Integer.parseInt(kingStoneN[2]);

        while (n-- > 0) {
            String command = br.readLine();

            switch (command) {
                case "B" :
                    int move = kingPosition[0] + 1;
                    if (move > board.length - 1) {
                        break;
                    }

                    if (move == stonePosition[0]) {
                        if (stonePosition[0] + 1 > board.length - 1) {
                            break;
                        }
                    }

                    kingPosition[0] = move;
                    break;
                case "L" :
                    break;
            }
        }

        System.out.println(board);
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }

    private static int[] setPosition(String[] args) {
        int x = args[0].charAt(0) - 65;
        int y = 7 - (Integer.parseInt(args[1]) - 1);

        board[y][x] = 1;
        return new int[] {y,x};
    }
}
