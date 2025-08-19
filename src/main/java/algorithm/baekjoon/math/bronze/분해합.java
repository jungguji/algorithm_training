package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분해합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N; ++i) {
            int sum = 0;

            sum += i;

            int current = i;
            while (current > 0) {
                sum += current % 10;
                current /= 10;
            }

            if (sum == N) {
                min = i;
                break;
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? 0 : min);
    }
}
