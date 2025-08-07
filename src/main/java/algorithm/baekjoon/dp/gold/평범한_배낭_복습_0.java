package algorithm.baekjoon.dp.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 평범한_배낭_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NK = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int N = NK[0];
        int K = NK[1];

        int[][] dp = new int[N + 1][K + 1];

        List<int[]> bag = new ArrayList<>();
        bag.add(new int[]{0, 0});
        while (NK[0]-- > 0) {
            bag.add(
                Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray()
            );
        }

        // 물건 N개 순서대로 확인
        // 이전것 확인안해도 이전 물건의 대한 무게랑 가치는
        // DP에 담김
        for (int i = 1; i <= N; ++i) {
            // 들수 있는 무게 K 까지 반복하면서
            // 어떤 물건을 넣을수 있는지 확인
            for (int j = 0; j <= K; ++j) {
                // 기본적으로 이전 물건까지 들었을때의 가치를 가져옴
                // 가방에 더 넣어보면서 확인하는거니까
                dp[i][j] = dp[i-1][j];

                // 들수 있는 무게 K에서
                // 지금 넣어볼 물건 i의 무게를 뻈는데
                // 0보다 작은거면
                // 지금 물건을 가방에 더 넣으면
                // K를 초과하는거니까 들수가 없음
                int[] stuff = bag.get(i);
                if (j - stuff[0] < 0) {
                    continue;
                }

                // 물건 추가해도 들수 있는 무게면
                // 물건 안추가했을 떄의 가치랑
                // 물건 추가했을 떄의 가치랑 비교해서 더 큰것 넣음
                // 물건 추가해야하니까 i-1,
                // 물건 추가하면 그만큼 무게가 늘어나니까 K - stuff[0]
                // 물건 추가하면 그만큼 가치가 늘어나니까 stuff[1]
                dp[i][j] = Math.max(dp[i][j], dp[i-1][j - stuff[0]] + stuff[1]);
            }
        }

        System.out.println(dp[N][K]);
    }
}
