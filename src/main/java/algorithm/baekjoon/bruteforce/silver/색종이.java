package algorithm.baekjoon.bruteforce.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 색종이 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());

            int[][] board = new int[101][101];

            int answer = 0;
            while (amount-- > 0) {
                int[] xy = convertStringArrayToIntegerArray(br.readLine().split(" "));

                for (int i = xy[1]; i < (xy[1] + 10); i++) {
                    for (int j = xy[0]; j < (xy[0] + 10); j++) {
                        if (board[i][j] != 1) {
                            board[i][j] = 1;

                            ++answer;
                        }
                    }
                }
            }

            System.out.println(answer);
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
}
