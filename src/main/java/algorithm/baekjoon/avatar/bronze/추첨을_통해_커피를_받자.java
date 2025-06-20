package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 추첨을_통해_커피를_받자 {

    private static final int[] MAX_SCORE = {100, 100, 200, 200, 300, 300, 400, 400, 500};

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int sum = 0;
            String answer = "draw";
            for (int i = 0; i < array.length; i++) {
                if (array[i] > MAX_SCORE[i]) {
                    System.out.println("hacker");
                    return;
                }

                sum += array[i];
            }

            System.out.println(sum < 100 ? "none" : answer);
        }
    }
}
