package algorithm.baekjoon.array.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int row = 9;

        int max = 0;
        int[] answer = new int[2];
        for (int i = 0; i < row; ++i) {
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = 0; j < row; ++j) {
                int current = array[j];
                if (current > max) {
                    max = current;
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        System.out.println(max + "\n" + (answer[0]+1) + " " + (answer[1]+1));

    }
}
