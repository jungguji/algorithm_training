package algorithm.baekjoon.dp.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 평범한_배낭_복습_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NK = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int N = NK[0];
        int K = NK[1];

        int[][] dp = new int[N + 1][K + 1];

        List<int[]> stuffs = new ArrayList<>();
        stuffs.add(new int[]{0, 0});

        while (NK[0]-- > 0) {
            stuffs.add(
                Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray()
            );
        }

        // 첫번째물건 부터 순서대로 담아봐야하니까
        for (int i = 1; i < stuffs.size(); ++i) {
            int[] stuff = stuffs.get(i);

            // 견딜 수 있는 무게를 조금씩 늘려가면서 이번 물건이 들어갈수 있는지 확인
            for (int j = 1; j <= K; ++j) {
                // 일단 가방엔 지금 물건 담기 전 물건의 무게만큼의 가치가 들어있으니까
                dp[i][j] = dp[i-1][j];

                // 이번 물건 들어갈수 있을지 확인
                // j = 현재 버틸수 있는 무게
                // stuff[0] = 현재 넣으려는 물건의 무게
                if (j - stuff[0] < 0) {
                    continue;
                }

                // 지금 물건 넣을수 있으면
                // 지금 가방에 들어있는 이전 물건넣었을때 가치랑(위에서 [i-1][j] 넣었음)
                // 지금 물건 넣기전의 무게에 지금 물건 추가했을떄의 가치랑 비교해서
                // 큰거 넣음
                // ex ) 이전 물건이 무게가 6 가치가 13이고 내가 들수 있는 무게가 7이면
                // 여태 담겨 잇던 물건에 하나 추가하는거니ㅏㄲ
                // 물건 하나 빼고 i-1
                // 물거 무게만큼 추가해야하니까 j-stuff[0] 하고
                // 물건 가치 더하고 + stuff[1]
                dp[i][j] = Math.max(dp[i][j], dp[i-1][j-stuff[0]] + stuff[1]);
            }
        }

        System.out.println(dp[N][K]);
    }
}
