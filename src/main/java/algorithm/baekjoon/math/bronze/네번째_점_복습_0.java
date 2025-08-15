package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 네번째_점_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = 3;
        int x = 0;
        int y = 0;
        while (input-- > 0) {
            int[] xy = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            x ^= xy[0];
            y ^= xy[1];
        }

        System.out.println(x + " " +  y);
    }
}
