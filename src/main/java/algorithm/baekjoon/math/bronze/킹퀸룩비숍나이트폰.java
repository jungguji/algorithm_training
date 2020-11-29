package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 킹퀸룩비숍나이트폰 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] chess = new int[]{1, 1, 2, 2, 2, 8};
            int[] array = convertStringArrayToIntegerArray(br.readLine().split(" "));

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < chess.length; i++) {
                sb.append(chess[i] - array[i]).append(" ");
            }

            System.out.println(sb);
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
