package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수학은비대면강의입니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] abcdef = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = -999; i <= 999; ++i) {
            for (int j = -999; j <= 999; ++j) {
                if (
                        (abcdef[0] * i) + (abcdef[1] * j) == abcdef[2]
                        && (abcdef[3] * i) + (abcdef[4] * j) == abcdef[5]
                ) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}
