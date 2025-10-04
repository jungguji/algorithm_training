package algorithm.baekjoon.recursive.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 별찍기10 {
    static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        map = new char[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(map[i], ' ');
        }

        drawStars(0, 0, N);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map[i]);
            sb.append('\n');
        }
        System.out.print(sb);
    }

    public static void drawStars(int row, int col, int size) {
        if (size == 1) {
            map[row][col] = '*';
            return;
        }

        int newSize = size / 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                drawStars(row + (newSize * i), col + (newSize * j), newSize);
            }
        }
    }
}
