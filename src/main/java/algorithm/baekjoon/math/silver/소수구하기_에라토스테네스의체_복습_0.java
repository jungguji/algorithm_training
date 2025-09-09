package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 소수구하기_에라토스테네스의체_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] MN = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int M = MN[0];
        int N = MN[1];

        boolean[] 소수아닌것들 = new boolean[N + 1];
        소수아닌것들[0] = true;
        소수아닌것들[1] = true;

        for (int i = 2; i*i <= N; ++i) {
            if (!소수아닌것들[i]) {

                for (int j = i*i; j <=N; j+=i) {
                    소수아닌것들[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = M; i <= N; ++i) {
            if (!소수아닌것들[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
