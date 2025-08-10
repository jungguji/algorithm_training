package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 진법변환2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NB = br.readLine().split(" ");

        int N = Integer.parseInt(NB[0]);
        int B = Integer.parseInt(NB[1]);

        StringBuilder sb = new StringBuilder();
        char ch;
        while (N > 0) {
            int value = N % B;
            N /= B;

            if (value < 10) {
                ch = (char) (value + '0');
            } else {
                ch = (char) (value - 10 + 'A');
            }

            sb.append(ch);
        }

        System.out.println(sb.reverse());
    }
}
