package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 크리스마스_파티 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();


            int[] 점수 = new int[N];
            for (int i = 0; i < M; ++i) {
                int[] 예측 = Arrays.stream(
                                br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                for (int j = 0; j < N; ++j) {
                    if (array[i] == 예측[j]) {
                        점수[j] += 1;
                    } else {
                        점수[array[i]-1] += 1;
                    }
                }
            }

            Arrays.stream(점수).forEach(System.out::println);
        }
    }
}
