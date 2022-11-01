package algorithm.baekjoon.class2.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 최대공약수와_최소공배수 {
    public static void main(String[] args) throws IOException {
        String input = getInputData(System.in);
        int[] nm = convertStringArrayToIntegerArray(input.split(" "));

        int[] gcdAndLcm = getGcdAndLcm(nm);

        System.out.println(gcdAndLcm[0]);
        System.out.println(gcdAndLcm[1]);
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

    public static int[] getGcdAndLcm(int[] nm) {
        int big = nm[0] > nm[1] ? nm[0] : nm[1];
        int small = nm[0] < nm[1] ? nm[0] : nm[1];
        int n = big;
        int m = small;

        while (m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }

        return new int[]{n, n * (big / n) * (small / n)};
    }
}
