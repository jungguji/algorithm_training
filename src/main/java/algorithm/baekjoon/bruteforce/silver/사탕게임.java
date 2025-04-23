package algorithm.baekjoon.bruteforce.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사탕게임 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            char[][] candy = new char[n][n];
            for (int i = 0; i < n; i++) {
                candy[i] = br.readLine().toCharArray();
            }

            int max = 0;
            for (int y = 0; y < n; y++) {
                for (int x = 0; x < n; x++) {
                    if (x + 1 < n && candy[y][x+1] != candy[y][x]) {
                        swap(candy, y, x, y, x+1);
                        max = Math.max(max, check(candy, n));
                        swap(candy, y, x, y, x+1);
                    }

                    if (y + 1 < n && candy[y+1][x] != candy[y][x]) {
                        swap(candy, y, x, y+1, x);
                        max = Math.max(max, check(candy, n));
                        swap(candy, y, x, y+1, x);
                    }
                }
            }
            System.out.println(max);
        }
    }

    private static int check(char[][] board, int n) {
        int max = 1;

        // 가로 검사
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 1; j < n; j++) {
                if (board[i][j] == board[i][j - 1]) {
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }

        // 세로 검사
        for (int j = 0; j < n; j++) {
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (board[i][j] == board[i - 1][j]) {
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }

        return max;
    }

    private static void swap(char[][] board, int y1, int x1, int y2, int x2) {
        char temp = board[y1][x1];
        board[y1][x1] = board[y2][x2];
        board[y2][x2] = temp;
    }
}
