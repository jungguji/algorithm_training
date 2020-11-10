package algorithm.baekjoon.class3.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단_오르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] stairs = new int[n];
        for (int i = 0; i < n; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(solution(stairs));
    }

    public static int solution(int[] stairs) {
        int n = stairs.length;
        stairs = initStairs(stairs);

        int[] dp = new int[n + 2];

        dp[0] = stairs[0];
        dp[1] = stairs[0] + stairs[1];
        dp[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 2]+ stairs[i], dp[i-3] + stairs[i - 1] + stairs[i]);
        }

        return dp[n - 1];
    }

    private static int[] initStairs(int[] stairs) {
        if (stairs.length > 3) {
            return stairs;
        }

        int[] newArray = new int[3];

        System.arraycopy(stairs, 0, newArray, 0, stairs.length);

        return newArray;
    }
}
