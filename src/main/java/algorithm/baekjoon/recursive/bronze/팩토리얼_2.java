package algorithm.baekjoon.recursive.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fac(n));
    }

    private static long fac(int n) {
        if (n == 0) {
            return 1L;
        }

        return n * fac(n-1);
    }
}
