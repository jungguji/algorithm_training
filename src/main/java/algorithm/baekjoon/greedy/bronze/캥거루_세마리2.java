package algorithm.baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 캥거루_세마리2 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = "";
            StringBuilder sb = new StringBuilder();
            while ((input = br.readLine()) != null) {
                int[] array = convertStringArrayToIntegerArray(input.split(" "));

                int max = Math.max(array[0], Math.max(array[1], array[2]));
                int min = Math.min(array[0], Math.min(array[1], array[2]));
                int mid = getCenterValue(array);

                System.out.println(Math.max(max-mid, mid-min) - 1);
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

    private static int getCenterValue(int[] array) {
        int max = Math.max(array[0], Math.max(array[1], array[2]));
        int tmp = Integer.MAX_VALUE;
        int mid = 0;
        for (int i = 0; i < array.length; i++) {
            if (max - array[i] < tmp && max - array[i] != 0) {
                mid = array[i];
                tmp = max - array[i];
            }
        }

        return mid;
    }
}
