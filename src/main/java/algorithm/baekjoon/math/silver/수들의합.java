package algorithm.baekjoon.math.silver;

import java.io.*;

public class 수들의합 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long S = Long.parseLong(br.readLine());

            // S = (N*(N+1)) /2
            // 2S = N*(N+1)
            // 2S = 2^N + N
            // 2^N + N - 2S = 0
            // N = (-1 +- 루트(1^2 - 4*1*(-2S))) / 2 * 1
            // N = (-1 +- 루트(1 - 4*(-2S)) / 2
            // N = (-1 +- 루트(1 - (-8S)) / 2
            // N = (-1 +- 루트(1 + 8S)) / 2
            double D = Math.sqrt(1 + 8L * S);
            System.out.println((long) Math.floor((-1 + D) / 2));
        }
    }
}