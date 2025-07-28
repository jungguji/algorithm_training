package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수5 {

    private static Long[] arr;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            arr = new Long[n+2];

            arr[0] = 0L;
            arr[1] = 1L;

            System.out.println(f(n));
        }
    }

    private static Long f(int n) {
        if (arr[n] != null) {
            return arr[n];
        }

        arr[n] = f(n-1) + f(n-2);
        return arr[n];
    }
}
