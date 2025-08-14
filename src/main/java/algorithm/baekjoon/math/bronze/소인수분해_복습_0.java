package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        // 우선 작은 짝수인 2로 다 나눔
        while (N%2 == 0) {
            N /= 2;
            sb.append(2).append("\n");
        }

        // 2 다음 작은 3부터 나누기 시작
        // 짝수는 다 짤라냈으니까 홀수만 다 확인해보면 됨
        for (int i = 3; i * i <= N; i+=2) {
            while (N % i == 0) {
                N /= i;
                sb.append(i).append("\n");
            }
        }

        if (N > 1) {
            sb.append(N);
        }

        System.out.println(sb);
    }
}
