package algorithm.baekjoon.class2.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Hashing {
    private static int MODULO = 96;
    private static int R = 31;
    private static int M = 1234567891;

    public static void main(String[] args) throws IOException {
        String input  = getInputData(System.in);

        long answer = solution(input);

        System.out.println(answer);
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            br.readLine();
            return br.readLine();
        }
    }

    public static long solution(String args) {
        char[] array = args.toCharArray();
        long sum = 0;
        long x = 1;

        for (char ch : array) {
            int value = (int) ch % MODULO;

            sum = (sum + (value * x)) % M;
            x = (x * R) % M;
        }

        return sum;
    }
}
