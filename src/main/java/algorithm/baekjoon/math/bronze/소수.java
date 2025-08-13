package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = M; i <= N; ++i) {
            boolean 소수임 = true;
            for (int j = 2; j * j <= i; ++j) {
                if (i % j == 0) {
                    소수임 = false;
                    break;
                }
            }

            if (i != 1 && 소수임) {
                sum += i;
                min = Math.min(min, i);
            }
        }

        System.out.println(sum == 0 ? -1 : sum+"\n"+min);
    }
}
