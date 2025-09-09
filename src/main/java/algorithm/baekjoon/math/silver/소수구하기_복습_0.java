package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 소수구하기_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] MN = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int M = MN[0];
        int N = MN[1];

        StringBuilder sb = new StringBuilder();
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    /**
     * 소수인지 판별하는 메서드
     * @param n 판별할 숫자
     * @return 소수이면 true, 아니면 false
     */
    private static boolean isPrime(int n) {
        // 1은 소수가 아님
        if (n < 2) {
            return false;
        }

        // 2는 소수임
        if (n == 2) {
            return true;
        }

        // 2를 제외한 모든 짝수는 소수가 아님
        if (n % 2 == 0) {
            return false;
        }

        // 3부터 n의 제곱근까지 홀수만 확인하여 나누어 떨어지는지 검사 [1, 13]
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; // 나누어 떨어지면 소수가 아님
            }
        }

        return true; // 위 모든 조건에 해당하지 않으면 소수임
    }
}
