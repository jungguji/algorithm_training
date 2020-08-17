package algorithm.baekjoon.class1.inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 점수_집계 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());

            for (int i = 0; i < amount; i++) {
                int[] array = convertStringArrayToIntegerArray(br.readLine().split(" "));

                Arrays.sort(array);

                int min = array[1];
                int max = array[array.length - 2];

                int answer = 0;
                for (int j = 1; j <= array.length - 2; j++) {
                    answer += array[j];
                }

                System.out.println((max - min < 4) ? answer : "KIN");
            }
        }
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;

        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }
}