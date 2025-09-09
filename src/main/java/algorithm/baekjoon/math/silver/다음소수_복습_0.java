package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 다음소수_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long T = Long.parseLong(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {

            long n = Long.parseLong(br.readLine());

            if (n <= 2) {
                sb.append(2).append("\n");
                continue;
            }

            while (true) {
                if (n % 2 == 0) {
                    ++n;
                }

                if (소수니(n)) {
                    sb.append(n).append("\n");
                    break;
                }

                ++n;
            }
        }

        System.out.println(sb);
    }

    private static boolean 소수니(long n) {
        boolean 소수임 = true;

        for (long i = 3; i * i <= n; i+=2) {
            if (n % i == 0) {
                소수임 = false;
                break;
            }
        }

        return 소수임;
    }
}
