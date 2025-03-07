package algorithm.baekjoon.recursive.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 칸토어_집합 {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = "";
            while ((input = br.readLine()) != null) {
                int n = Integer.parseInt(input);

                int pow = (int) Math.pow(3, n);
                char[] array = new char[pow];

                for (int i = 0; i < pow; i++) {
                    array[i] = '-';
                }

                char[] k = getCantor(array);
                System.out.println(k);
            }
        }
    }

    public static char[] getCantor(char[] array) {

        if (array.length == 1) {
            return array;
        }

        int separateLength = array.length / 3;

        char[] first = Arrays.copyOfRange(array, 0, separateLength);
        char[] second = new char[separateLength];
        char[] third = Arrays.copyOfRange(array, separateLength * 2, array.length);

        for (int i = 0; i < separateLength; i++) {
            second[i] = ' ';
        }

        first = getCantor(first);
        third = getCantor(third);

        char[] merged = new char[array.length];

        System.arraycopy(first, 0, merged, 0, first.length);
        System.arraycopy(second, 0, merged, first.length, second.length);
        System.arraycopy(third, 0, merged, first.length + second.length, third.length);

        return merged;
    }
}
