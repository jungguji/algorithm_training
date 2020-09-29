package algorithm.baekjoon.bruteforce.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 거꾸로_구구단 {
    public static void main(String[] args) throws IOException {
        int[] array = convertStringArrayToIntegerArray(getInputData(System.in).split(" "));

        int n = array[0];
        int k = array[1];

        int max = 0;
        for (int i = 1; i <= k; i++) {
            int current = Integer.parseInt(new StringBuffer().append(i * n).reverse().toString());
            max = max > current ? max : current;
        }

        System.out.println(max);
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
