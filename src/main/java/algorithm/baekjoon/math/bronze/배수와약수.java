package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 배수와약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        StringBuilder sb = new StringBuilder();
        while (!((input = br.readLine()).equals("0 0"))) {
            int[] array = Arrays.stream(input.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (array[1] % array[0] == 0) {
                sb.append("factor\n");
                continue;
            }

            if (array[0] % array[1] == 0) {
                sb.append("multiple\n");
                continue;
            }

            sb.append("neither\n");
        }

        System.out.println(sb);
    }
}
