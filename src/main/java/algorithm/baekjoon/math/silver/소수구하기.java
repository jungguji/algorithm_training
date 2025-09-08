package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 소수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] MN = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int M = MN[0];
        int N = MN[1];

        StringBuilder sb = new StringBuilder();

        while (M <= 2 && M <= N) {
            if (M == 2) {
                sb.append(M).append("\n");
            }
            ++M;
        }

        if (M % 2 == 0) {
            ++M;
        }

        for (int i = M; i <= N; i+=2) {
            if (소수니(i)) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    private static boolean 소수니(int n) {
        boolean 소수다 = true;
        for (int i = 3; i*i <= n; i+=2) {
            if (n % i == 0) {
                소수다 = false;
                break;
            }
        }

        return 소수다;
    }
}
