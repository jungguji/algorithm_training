package algorithm.baekjoon.class2.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 체스판_다시_칠하기 {
    private static final char[] BW = new char[] {'B', 'W'};

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int[] xy = convertStringArrayToIntegerArray(br.readLine().split(" "));

            int x = xy[0];
            int y = xy[1];

            char[][] checkerboard = new char[x][y];

            for (int i = 0; i < x; i++) {
                checkerboard[i] = br.readLine().toCharArray();
            }

            int minValue = solution(checkerboard, x, y);
            System.out.println(minValue);
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

    public static int solution(char[][] checkerboard, int x, int y) {
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i <= (x - 8); i++) {
            for (int j = 0; j <= (y - 8); j++) {
                int currentValue = getChangeCount(checkerboard, i, j);

                answer = answer > currentValue ? currentValue : answer;
            }
        }

        return answer;
    }

    private static int getChangeCount(char[][] checkerboard, int x, int y) {
        int minChangeCount = Integer.MAX_VALUE;

        int loopCount = 0;
        while (loopCount < 2) {
            char[][] copy = copyArray(checkerboard);


            int change = initFirstLine(copy, x, y, loopCount);

            change += getCheckerboardSwapCount(x, y, copy);

            ++loopCount;

            minChangeCount = minChangeCount > change ? change : minChangeCount;
        }

        return minChangeCount;
    }

    private static char[][] copyArray(char[][] checkerboard) {
        char[][] copy = new char[checkerboard.length][checkerboard[0].length];

        for (int i = 0; i < checkerboard.length; i++) {
            copy[i] = checkerboard[i].clone();
        }

        return copy;
    }

    private static int initFirstLine(char[][] checkerboard, int start, int y, int color) {
        int change = 0;
        if (checkerboard[start][y] != BW[color % 2]) {
            ++change;
        }

        checkerboard[start][y] = BW[color % 2];

        for (int i = start + 1; i < 8 + start; i++) {
            ++color;

            if (checkerboard[i - 1][y] == checkerboard[i][y]) {
                ++change;
            }

            checkerboard[i][y] = BW[color % 2];
        }

        return change;
    }

    private static int getCheckerboardSwapCount(int x, int y, char[][] copy) {
        int change = 0 ;

        for (int i = x; i < 8 + x; i++) {
            for (int j = y + 1; j < 8 + y; j++) {
                if (copy[i][j - 1] == copy[i][j]) {
                    ++change;

                    copy[i][j] = (copy[i][j - 1] =='B') ? 'W' : 'B';
                }
            }
        }

        return change;
    }
}
