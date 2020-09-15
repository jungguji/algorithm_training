package algorithm.baekjoon.class2.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 마인크래프트 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nmb = convertStringArrayToIntegerArray(br.readLine().split(" "));

            int n = nmb[0];
            int m = nmb[1];

            int[][] ground = initGround(br, n, m);
            int[] minAndMax = getMinAndMax(ground);

            int[] timeAndHigh = getMinimumConstructionTime(ground, nmb[2], minAndMax[0], minAndMax[1]);

            System.out.println(timeAndHigh[0] + " " + timeAndHigh[1]);
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

    private static int[][] initGround(BufferedReader br, int n, int m) throws IOException {
        int[][] ground = new int[n][m];
        for (int i = 0; i < n; i++) {
            ground[i] = convertStringArrayToIntegerArray(br.readLine().split(" "));
        }

        return ground;
    }

    private static int[] getMinAndMax(int[][] ground) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int[] i : ground) {
            for (int j : i) {
                min = min > j ? j : min;
                max = max < j ? j : max;
            }
        }

        return new int[] {min, max};
    }

    private static int[] getMinimumConstructionTime(int[][] ground, int inventory, int min, int max) {
        int answerTime = Integer.MAX_VALUE;
        int answerHigh = 0;

        for (int currentHigh = min; currentHigh <= max; currentHigh++) {
            int up = 0;
            int down = 0;

            for (int i = 0; i < ground.length; i++) {
                for (int j = 0; j < ground[0].length; j++) {
                    int high = ground[i][j] - currentHigh;

                    if (high > 0) {
                        down += high;
                    } else if (high < 0) {
                        up -= high;
                    }
                }
            }

            if (down + inventory >= up) {
                int time = (down * 2) + up;

                if (answerTime >= time) {
                    answerTime = time;
                    answerHigh = currentHigh;
                }
            }
        }

        return new int[]{answerTime, answerHigh};
    }
}
