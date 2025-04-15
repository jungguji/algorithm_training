package algorithm.baekjoon.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 가장_긴_증가하는_부분수열 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] dp = new int[n];
            // 자기자신 포함하면 1이니깐 기본적으로 1로 시작
            Arrays.fill(dp, 1);

            // 초기값 지정했으니깐 그 이후부터 돌아
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    // 자기 이전 원소들이랑 계속 비교하면서 나보다 작은지 판단
                    // 가장 긴 수열 구하는거니까
                    if (arr[i] > arr[j]) {
                        // 그런데, 지금 계산중인 길이 = dp[i]랑
                        // 현재 구하는 중인 길이에 +1(자기자신 플러스) 한거랑 비교해서
                        // 큰거를 지금 계산중인 길이에 저장
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
            }

            System.out.println(Arrays.stream(dp).max().getAsInt());
        }
    }
}
