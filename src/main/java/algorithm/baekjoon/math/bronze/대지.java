package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 대지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(0);
            return;
        }

        int[] x = new int[2];
        x[0] = Integer.MIN_VALUE;
        x[1] = Integer.MAX_VALUE;

        int[] y = new int[2];
        y[0] = Integer.MIN_VALUE;
        y[1] = Integer.MAX_VALUE;

        while (N-- > 0) {
            int[] xy = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            x[0] = Math.max(xy[0], x[0]);
            x[1] = Math.min(xy[0], x[1]);

            y[0] = Math.max(xy[1], y[0]);
            y[1] = Math.min(xy[1], y[1]);
        }

        System.out.println((x[0]-x[1]) * (y[0]-y[1]));
    }
}
