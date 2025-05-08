package algorithm.baekjoon.dp.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 가장_긴_바이토닉_부분_수열 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int[] A = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] dp1 = new int[N+1];
            int[] dp2 = new int[N+1];

            Arrays.fill(dp1, 1);
            Arrays.fill(dp2, 1);

            // 0번쨰부터 끝까지 가는 수열 중 제일 큰 길이 (LIS)를 구함
            for (int i = 1; i < N; i++) {
                for (int j = 0; j < i; j++) {
                    if (A[i] > A[j]) {
                        dp1[i] = Math.max(dp1[i], dp1[j]+1);
                    }
                }
            }

            // N(끝)부터 0까지 가는 수열 중 제일 큰 길이를 구함
            for (int i = N-2; i >= 0; i--) {
                for (int j = N-1; j > i; j--) {
                    if (A[i] > A[j]) {
                        dp2[i] = Math.max(dp2[i], dp2[j]+1);
                    }
                }
            }

            int answer = 0;
            // 0부터 돌면서 어디까지 갔다가 내려가야 제일 큰지 구함
            for (int i = 0; i < N; i++) {
                // 같은 자리가 중복되서 계산되므로 1을 빼줌
                answer = Math.max(answer, dp1[i] + dp2[i] -1);
            }

            System.out.println(answer);
        }
    }
}
