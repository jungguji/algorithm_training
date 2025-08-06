package algorithm.baekjoon.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 가장_긴_증가하는_부분수열_복습_1 {

    private static int[] A1;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        A1 = new int[N+1];
        dp = new int[N+1];

        dp[1] = 1;

        for (int i = 1; i <= array.length; ++i) {
            A1[i] = array[i-1];
        }

        // 모든 위치에 대해 비교해야하니까
        // 초기값으로 지정한 1번를 제외한 2번부터 N까지 돔
        for (int i = 2; i <= N; ++i) {
            recursive(i);
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());
    }

    private static int recursive(int index) {
        if (dp[index] != 0) {
            return dp[index];
        }

        // 이전에 구한값에 자기자신 더하기 위해 0으로 초기화
        int max = 0;
        // 지금 위치까지 오면서 이전값들과 비교해서 새로 얼마나 길어지는지 판단하기 위해
        // 1부터 현재위치 까지 루프
        for (int i = 1; i < index; ++i) {
            if (A1[i] >= A1[index]) {
                continue;
            }

            // 이전에 i까지 연속되서 증가한 길이와 지금 내 상태에서 증가한 길이와 비교해서 더 긴 길이 저장
            max = Math.max(max, recursive(i));
        }

        // 이전에 구한 값에서 자기자신 추가한 값
        dp[index] = max + 1;

        return dp[index];
    }
}
