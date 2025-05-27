package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 삼대_512 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());

            int answer = 0;
            while (N-- > 0) {
                int[] abc = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                int rm = abc[0] + abc[1] + abc[2];

                if (rm >= 512 && Math.abs(answer-512) > Math.abs(rm-512)) {
                    answer=rm;
                }
            }

            System.out.println(answer == 0 ? -1 : answer);
        }
    }
}
