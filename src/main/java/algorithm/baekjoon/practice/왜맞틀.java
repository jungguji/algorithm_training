package algorithm.baekjoon.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 왜맞틀 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] sampleAndSystemCase = convertStringArrayToIntegerArray(br.readLine().split(" "));
            int testcaseAmount = sampleAndSystemCase[0] + sampleAndSystemCase[1];

            for (int i = 0; i < testcaseAmount; i++) {

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


