package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 주사위_세개 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] count = new int[7];

        ++count[array[0]];
        ++count[array[1]];
        ++count[array[2]];

        for (int i = 1; i <= 6; ++i) {
            if (count[i] == 3) {
                System.out.println(10000 + (i * 1000));
                return;
            }
        }

        for (int i = 1; i <= 6; ++i) {
            if (count[i] == 2) {
                System.out.println(1000 + (i * 100));
                return;
            }
        }

        System.out.println(Math.max(array[0], Math.max(array[1], array[2])) * 100);

    }
}
