package algorithm.baekjoon.dp.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] A = br.readLine().toCharArray();
        char[] B = br.readLine().toCharArray();

        int A_length = A.length;
        int B_length = B.length;

        // 문자열 두개애 대해 이차원 배열로 dp table 생성
        // [3][2] 면 첫번쨰 문자열의 세번째 문자와 두번쨰 문자열의 두번쨰 문자까지 확인했을때 LCS 값이 저장됨
        int[][] dp = new int[A_length+1][B_length+1];

        for (int i = 1; i <= A_length; ++i) {
            for (int j = 1; j <= B_length; ++j) {
                // 두 문자가 같으면
                // 두 문자를 동시에 사용해야하니까 둘다 한칸씩 뺸 위치에서 구한 LCS에다
                // 현재위치를 더해야하니까 + 1
                if (A[i-1] == B[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    // 그게 아니라면 둘중 하나라도 써서 더 길어지는 애 있으면
                    // 그 값들중 큰값으로
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[A_length][B_length]);
    }
}
