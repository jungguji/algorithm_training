package algorithm.baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 오와육의차이 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array = Arrays.stream(br.readLine().split(" "))
                    .toArray(String[]::new);

            int min = Arrays.stream(array)
                    .map(s -> s.replaceAll("6", "5"))
                    .mapToInt(Integer::parseInt)
                    .sum();

            int max = Arrays.stream(array)
                    .map(s -> s.replaceAll("5", "6"))
                    .mapToInt(Integer::parseInt)
                    .sum();

            System.out.println(min + " " + max);
        }
    }
}
