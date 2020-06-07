package algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 로프 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int[] weights = getWeights(input, br);

        long answer = getMaxWeight(weights);
        System.out.println(answer);
    }

    private static int[] getWeights(int amount, BufferedReader br) throws IOException {
        int[] result = new int[amount];
        for (int i = 0; i < amount; i++) {
            result[i] = Integer.parseInt(br.readLine());
        }

        return result;
    }

    public static long getMaxWeight(int[] weights) {
        Arrays.sort(weights);

        int weightAmount = weights.length;

        long max = 0;

        for (int i : weights) {
            long currentValue = weightAmount * i;
            if (max < currentValue) {
                max = currentValue;
            }

            --weightAmount;
        }

        return max;
    }
}
