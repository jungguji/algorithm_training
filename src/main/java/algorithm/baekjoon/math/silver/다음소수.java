package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 다음소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long T = Long.parseLong(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            long n = Long.parseLong(br.readLine());

            // 0은 소수 아님
            // 1도 자기 자신 밖에 없어서 소수아님
            // 2는 소수임
            if (n <= 2) {
                sb.append(2).append("\n");
                continue;
            }

            // 소수는 자기 자신이랑 1로만 나눠 떨엉짐
            // 짝수는 아니니까 먼저 처리
            if (n % 2 == 0) {
                ++n;
            }

            while (true) {

                if (소수니(n)) {
                    sb.append(n).append("\n");
                    break;
                }

                n += 2;
            }
        }

        System.out.println(sb);
    }

    private static boolean 소수니(long n) {
        boolean 소수 = true;

        // 짝수는 할필요 없으니까 홀수들만하기 위해 2씩 증가시켜
        for (long i = 3; i*i <= n; i+=2) {
            if (n % i == 0) {
                소수 = false;
                break;
            }
        }

        return 소수;
    }
}
