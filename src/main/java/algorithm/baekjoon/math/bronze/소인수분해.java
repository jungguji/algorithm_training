package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        // 2는 가장 유일한 짝수 소수 이므로 2로 나눌수 있는건 먼저 다 처리
        while (N % 2 == 0) {
            sb.append(2).append("\n");
            N /= 2;
        }

        // 짝수처리 다 했으니까 3부터 소수 찾으면서 처리
        // 짝수 다 처리했으니까 i를 1찍 증가 시킬 필요 없음
        for (int i = 3; i * i  <= N; i += 2) {

            // N이 i로 나눠지면 그걸로 안나눠질때까지 계속 나눔
            while (N % i == 0) {
                sb.append(i).append("\n");
                N /= i;
            }
        }

        // N이 1보다 크면 N이 소수라는 뜻
        if (N > 1) {
            sb.append(N).append("\n");
        }

        System.out.println(sb);
    }
}
