package algorithm.baekjoon.class3.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 파도반_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (testCase-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long[] array = new long[n + 6];

            array[1] = 1;
            array[2] = 1;
            array[3] = 1;
            array[4] = 2;
            array[5] = 2;

            for (int i = 6; i <= n; i++) {
                array[i] = array[i - 5] + array[i - 1];
            }

            sb.append(array[n]).append("\n");
        }

        System.out.println(sb);
    }
}
