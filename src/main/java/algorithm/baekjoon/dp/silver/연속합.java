package algorithm.baekjoon.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 연속합 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] d = new int[n];

            d[0] = array[0];

            for (int i = 1; i < n; i++) {
                d[i] = Math.max(array[i] + d[i-1], array[i]);
            }

            System.out.println(
                    Arrays.stream(d)
                    .max()
                    .getAsInt()
            );
        }
    }
}
