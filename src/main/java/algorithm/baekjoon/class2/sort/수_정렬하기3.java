package algorithm.baekjoon.class2.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수_정렬하기3 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int amount = Integer.parseInt(br.readLine());

            int[] array = new int[amount];
            for (int i = 0; i < amount; i++) {
                array[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(array);

            StringBuilder sb = new StringBuilder();
            for (int i : array) {
                sb.append(i).append("\n");
            }

            System.out.println(sb);
        }
    }
}
