package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치_수열5 {
    private static Integer[] arr;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            arr = new Integer[n+2];
            arr[0] = 0;
            arr[1] = 1;

            System.out.println(p(n));
        }

    }

    private static int p(int n) {
        // 종료조건
        if (arr[n] != null) {
            return arr[n];
        }

        arr[n] = p(n-1) + p(n-2);
        return arr[n];
    }
}
