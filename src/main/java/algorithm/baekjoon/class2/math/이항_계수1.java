package algorithm.baekjoon.class2.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 이항_계수1 {
    public static void main(String[] args) throws IOException {
        int[] nk = convertStringArrayToIntegerArray(getInputData(System.in).split(" "));

        int n = nk[0];
        int k = nk[1];

        int f[] = new int[n + 1];
        f[0] = 1;
        f[1] = 1;

        f(nk[0], f);

        System.out.println(f[n] / (f[k] * f[n - k]));
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

    private static void f(int value, int[] f) {
        for (int i = 2; i <= value; i++) {
            f[i] = i * f[i-1];
        }
    }
}
