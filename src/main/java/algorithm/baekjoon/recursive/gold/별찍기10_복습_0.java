package algorithm.baekjoon.recursive.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기10_복습_0 {

    private static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        board = new char[N+1][N+1];
        for (int i = 0; i <= N; ++i) {
            for (int j = 0; j <= N; ++j) {
                board[i][j] = ' ';
            }
        }

        recursive(0, 0, N);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= N; ++i) {
            for (int j = 0; j <= N; ++j) {
                sb.append(board[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }

    private static void recursive(int y, int x, int size) {
        if (size == 1) {
            board[y][x] = '*';
            return;
        }

        int newSize = size / 3;

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (i == 1 && j == 1) {
                    continue;
                }

                recursive(y + (newSize * i), x + (newSize * j), newSize);
            }
        }
    }
}
