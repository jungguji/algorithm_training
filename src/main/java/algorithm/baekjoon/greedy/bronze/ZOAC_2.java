package algorithm.baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZOAC_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputs = br.readLine().toCharArray();

        int answer = 0;
        char pre = 'A';
        for (int i = 0; i < inputs.length; i++) {
            char current = inputs[i];

            int test = Math.abs((pre) - (current));

            if (test < 14) {
                answer += test;
            } else {
                answer += 26 - test;
            }

            pre = current;
        }

        System.out.println(answer);
    }
}
