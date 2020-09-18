package algorithm.baekjoon.bruteforce.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 기숙사_바닥 {
    public static void main(String[] args) throws IOException {
        int[] rb = convertStringArrayToIntegerArray(getInputData(System.in).split(" "));

        int sum = rb[0] + rb[1];
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                int border = (((sum / i) * 2) + (i * 2)) - 4;
                int center = sum - border;

                if (rb[0] == border && rb[1] == center) {
                    sb.append(sum / i).append(" ").append(i);
                    break;
                }
            }
        }

        System.out.println(sb);
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
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
