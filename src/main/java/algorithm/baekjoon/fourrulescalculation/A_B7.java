package algorithm.baekjoon.fourrulescalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_B7 {
    private static final String PREFIX = "Case #";
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());

            int i = 1;
            StringBuilder sb = new StringBuilder();
            while (amount-- > 0) {
                int[] array = convertStringArrayToIntegerArray(br.readLine().split(" "));

                sb.append(PREFIX).append(i++).append(": ").append(array[0] + array[1]).append("\n");
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
