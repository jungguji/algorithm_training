package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 진법변환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NB = br.readLine().split(" ");

        char[] N = NB[0].toCharArray();
        int B = Integer.parseInt(NB[1]);

        int sum = 0;
        int exponents = 0;
        for (int i = N.length-1; i >= 0; --i) {
            int value = 0;
            if ('A' <= N[i] && N[i] <= 'Z') {
                value = N[i] - 55;
            } else {
                value = N[i] - '0';
            }

            sum += (value * (int) Math.pow(B, exponents++));
        }

        System.out.println(sum);
    }
}
