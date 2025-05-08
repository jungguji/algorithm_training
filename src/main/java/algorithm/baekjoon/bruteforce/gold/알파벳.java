package algorithm.baekjoon.bruteforce.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 알파벳 {

    private static int N;
    private static int M;

    private final static int[] move = new int[]{ -1, 1, -1, 1};

    private static boolean[] used = new boolean[27];

    private static char[][] arr;

    private static int answer = 0;
    private static int currentLength = 0;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nm = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            N = nm[0];
            M = nm[1];

            arr = new char[N][M];

            for (int i = 0; i< N; i++) {
                arr[i] = br.readLine().toCharArray();
            }

            search(0, 0);

            System.out.println(answer);
        }
    }

    private static void search(int x, int y) {
        //base case
        if (x < 0 || y < 0 || x >= N || y >= M) {
            return;
        }

        int current = arr[x][y] - 'A';
        if (used[current]) {
            return;
        }

        ++currentLength;

        answer = Math.max(currentLength, answer);
        used[current] = true;

        search(x + move[0], y);
        search(x + move[1], y);
        search(x, y + move[2]);
        search(x, y + move[3]);

        used[current] = false;
        --currentLength;

    }
}
