package algorithm.baekjoon.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 가장_긴_증가하는_부분수열_복습_0 {

    private static int[] dp;
    private static int[] array;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new int[N+1];
        dp[1] = 1;
        int[] array1 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        array = new int[array1.length+1];

        for (int i = 1; i <= array1.length; ++i) {
            array[i] = array1[i-1];
        }

        for (int i = 1; i <= N; ++i) {
            f(i);
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());
    }

    private static int f(int n) {
        if (dp[n] != 0) {
            return dp[n];
        }

        int max = 0;
        for (int i = 1; i < n; ++i) {
            if (array[n] > array[i]) {
                max = Math.max(max, f(i));
            }
        }

        dp[n] = max + 1;

        return dp[n];
    }
}
