package algorithm.baekjoon.recursive.bronze;

import java.io.*;

public class 팩토리얼2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(f(N));
    }

    private static long f(int n) {
        if (n < 2) {
            return 1;
        }

        return n * f(n-1);
    }
}
