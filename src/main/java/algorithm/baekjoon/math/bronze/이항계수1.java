package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 이항계수1 {
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        /*
        조합은 순서 없이 n개 중에 r개 고르는 곳
        순서 상관있게 고르는 순열인 nPr 중에서 r의 자리에 올수 있는 경우의 수 r!을 빼면
        nPr/r! 이됨
        nPr = n * (n-1) * (n-2) ... * (n-r+1)
        = n! / (n-r)!
        = {n!}/{(n-r)!} / r!
        =  {n!}/{(n-r)!} * 1 / r!
        = n! / (n-r)!r!

        */

        int n = array[0];
        int r = array[1];

        dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        if (r == 0 || n==r) {
            System.out.println(1);
        } else {
            System.out.println(f(n) / (f(n-r) * f(r)));
        }
    }

    private static int f(int n) {
        if (dp[n] != 0) {
            return n * dp[n];
        }

        if (n < 2) {
            return 1;
        }
        dp[n] = f(n-1);

        return n * dp[n];
    }
}
