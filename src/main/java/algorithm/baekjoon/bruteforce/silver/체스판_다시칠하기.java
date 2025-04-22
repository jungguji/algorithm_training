package algorithm.baekjoon.bruteforce.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 체스판_다시칠하기 {

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] NM = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int N = NM[0];
            int M = NM[1];
            char[][] chess = new char[N][M];
            for (int i = 0; i < N; i++) {
                chess[i] = br.readLine().toCharArray();
            }

            char[] bw = new char[]{ 'B', 'W'};

            int bMin = Integer.MAX_VALUE;
            for (int y = 0; y <= N-8; y++) {
                for (int x = 0; x <= M-8; x++) {
                    int b = 0;

                    for (int j = y; j < 8+y; j++) {
                        for (int k = x; k < 8+x; k++) {
                            if (bw[(k+j) % 2] != chess[j][k]) {
                                ++b;
                            }
                        }
                    }

                    bMin = Math.min(bMin, b);
                }

            }

            int wMin = Integer.MAX_VALUE;
            for (int y = 0; y <= N-8; y++) {
                for (int x = 0; x <= M-8; x++) {
                    int w = 0;

                    for (int j = y; j < 8+y; j++) {
                        for (int k = x; k < 8+x; k++) {
                            if (bw[(k+j) % 2] == chess[j][k]) {
                                ++w;
                            }
                        }
                    }

                    wMin = Math.min(wMin, w);
                }
            }

            System.out.println(Math.min(bMin,wMin) == Integer.MAX_VALUE ? 0 : Math.min(bMin,wMin));
        }
    }
}
