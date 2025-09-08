package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 베르트랑공준 {

    private static final int MAX = 123456 * 2;

    public static void main(String[] args) throws IOException {
        boolean[] 소수아님 = new boolean[MAX+1];
        소수아님[0] = true;
        소수아님[1] = true;

        for (int i = 2; i*i <= MAX; ++i) {
            if (!소수아님[i]) {

                for (int j = i*i; j <= MAX; j+=i) {
                    소수아님[j] = true;
                }
            }
        }

        int[] dp = new int[MAX+1];

        int count = 0;
        for (int i = 0; i <= MAX; ++i) {
            if (!소수아님[i]) {
                ++count;
            }

            dp[i] = count;
        }

        StringBuilder sb = new StringBuilder();
        String input;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (!((input = br.readLine()).equals("0"))) {
            int n = Integer.parseInt(input);

            sb.append(dp[2*n]-dp[n]).append("\n");
        }

        System.out.println(sb);
    }
}
