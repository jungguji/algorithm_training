package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집_복습_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());

        int layer = 1;
        while (N > 0) {
            if (N == 1) {
                break;
            }

            N -= (layer*6L);
            ++layer;
        }

        System.out.println(layer);
    }
}
