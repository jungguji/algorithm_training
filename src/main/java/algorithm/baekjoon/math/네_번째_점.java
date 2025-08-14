package algorithm.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 네_번째_점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] x = new boolean[1001];
        boolean[] y = new boolean[1001];

        int input = 3;

        while (input-- > 0) {
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (x[array[0]]) {
                x[array[0]] = false;
            } else {
                x[array[0]] = true;
            }

            if (y[array[1]]) {
                y[array[1]] = false;
            } else {
                y[array[1]] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < x.length; ++i) {
            if (x[i]) {
                sb.append(i).append(" ");
            }
        }

        for (int i = 1; i < y.length; ++i) {
            if (y[i]) {
                sb.append(i);
            }
        }

        System.out.println(sb);
    }
}
