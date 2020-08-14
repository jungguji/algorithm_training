package algorithm.baekjoon.class2.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 직각삼각형 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = "";
            while (!((input = br.readLine()).equals("0 0 0"))) {
                int[] triangle = convertStringArrayToIntegerArray(input.split(" "));

                Arrays.sort(triangle);

                long a1 = triangle[0] * triangle[0];
                long a2 = triangle[1] * triangle[1];
                long a3 = triangle[2] * triangle[2];

                System.out.println(a3 == a1 + a2 ? "right" : "wrong");
            }
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
