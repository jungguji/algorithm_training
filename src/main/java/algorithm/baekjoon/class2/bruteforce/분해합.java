package algorithm.baekjoon.class2.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 분해합 {
    public static void main(String[] args) throws IOException {
        String input = getInputData(System.in);
        int n = Integer.parseInt(input);
        int minimum = n - 9 * (input.length() - 1);

        int answer = 0;
        for (int i = minimum; i <= n; i++) {
            int current = getConstructor(i);

            if (n == current) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
        }
    }

    private static int getConstructor(int number) {
        int sum = number;
        while (number > 0) {
            sum += (number % 10);
            number /= 10;
        }

        return sum;
    }
}
