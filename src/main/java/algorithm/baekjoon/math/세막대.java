package algorithm.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 세막대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        64+16+41-(64-(41+16)) - 1
        3+2+1 - (3-(2+1)) -1 =
         */

        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(array);

        if (array[2] < (array[0] + array[1])) {
            System.out.println(array[0] + array[1] + array[2]);
            return;
        }

        System.out.println(
                (array[0] + array[1] + array[2])
                - (array[2] - (array[0] + array[1]))
                - 1
        );
    }
}
