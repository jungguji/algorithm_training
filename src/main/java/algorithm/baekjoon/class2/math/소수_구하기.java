package algorithm.baekjoon.class2.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 소수_구하기 {
    public static void main(String[] args) throws IOException {
        int[] nm = convertStringArrayToIntegerArray(getInputData(System.in).split(" "));

        System.out.println(solution(nm[0], nm[1]));
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

    public static String solution(int n, int m) {
        boolean[] isNotPrime = new boolean[m + 1];

        isNotPrime[0] = isNotPrime[1] = true;

        for (int i = 2; (i * i) <= m; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= m; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = n; i <= m; i++) {
            if (!isNotPrime[i]) {
                sb.append(i).append("\n");
            }
        }

        return sb.toString();
    }
}
