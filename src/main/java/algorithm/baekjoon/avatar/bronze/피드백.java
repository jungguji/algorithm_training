package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피드백 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());

            int 제일큰소수 = 제일큰소수(1000);

            StringBuilder sb = new StringBuilder();

            sb.append(1).append(" ");
            sb.append(2).append(" ");

            for (int i = 3; i < N; i++) {
                sb.append(i).append(" ");
            }

            sb.append(제일큰소수);
            System.out.println(N);
            System.out.println(sb);
        }
    }

    private static int 제일큰소수(int N) {

        boolean[] 소수아님 = new boolean[N+1];
        소수아님[0] = true;
        소수아님[1] = true;

        for (int i = 2; i < Math.sqrt(N); ++i) {
            if (!소수아님[i]) {
                for (int j = i * i; j < N+1; j += i) {
                    소수아님[j] = true;
                }
            }
        }

        int 제일큰소수 = 0;
        for (int i = N; i > 2; --i) {
            if (!소수아님[i]) {
                제일큰소수 = i;
                break;
            }
        }

        return 제일큰소수;
    }
}
