package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 소수구하기_에라토스테네스의체 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] MN = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int M = MN[0];
        int N = MN[1];

        boolean[] 소수아닌애들 = new boolean[N+1];
        소수아닌애들[0] = true;
        소수아닌애들[1] = true;

        // 2부터 N의 제곱근까지 반복
        for (int i = 2; i * i <= N; i++) {
            // i가 소수라면 (아직 지워지지 않았다면)
            if (!소수아닌애들[i]) {
                // i의 배수들을 모두 지운다.
                // j는 i*i부터 시작. 그 이전 값들은 이미 다른 소수의 배수로 지워졌기 때문
                for (int j = i * i; j <= N; j += i) {
                    소수아닌애들[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = M; i <= N; ++i) {
            if (!소수아닌애들[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }


}
