package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 진법변환2_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NB = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        char[] chars = new char[36];
        char ch = 'A';
        for (int i = 0; i < 36; ++i) {
            if (i < 10) {
                chars[i] = (char) (i + '0');
            } else {
                chars[i]= ch++;
            }
        }

        int N = NB[0];
        int B = NB[1];

        // 진수로 계속 나누면서 ~ 더하기
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            int value = N % B;
            N /= B;

            sb.append(chars[value]);
        }

        System.out.println(sb.reverse());
    }
}
