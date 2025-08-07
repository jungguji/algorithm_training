package algorithm.baekjoon.dp.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS_복습_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] A1 = br.readLine().toCharArray();
        char[] B1 = br.readLine().toCharArray();

        int[][] dp = new int[A1.length+1][B1.length+1];

        // A1의 첫번쨰 문자부터
        for (int i = 1; i <= A1.length; ++i) {
            // B1의 첫번째 문자부터해서 끝까지 A1의 i 번째까지 비교하면서 가장 긴 LCS 찾음
            for (int ii = 1; ii <= B1.length; ++ii) {
                if (A1[i-1] == B1[ii-1]) {
                    // 두개가 같은 경우엔 둘다 하나씩 뺀 곳에서 올수 밖에 없음
                    // 그리고 자기자신 더해야하니까 + 1
                    dp[i][ii] = dp[i-1][ii-1] + 1;
                } else {
                    // 두개가 다른 경우엔 둘중 하나씩 뺸곳에서 올수 있음
                    // 그 두 루트중 큰 값인걸로
                    dp[i][ii] = Math.max(dp[i-1][ii], dp[i][ii-1]);
                }
            }
        }

        // 마지막까지 모두 비교했을때 가장 긴 LCS
        System.out.println(dp[A1.length][B1.length]);
    }
}
