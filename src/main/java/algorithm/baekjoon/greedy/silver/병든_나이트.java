package algorithm.baekjoon.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 병든_나이트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = convertStringArrayToIntegerArray(br.readLine().split(" "));

        int n = array[0];
        int m = array[1];

        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(Math.min(4, ((m+1)/2)));
        } else if (m < 7) {
            System.out.println(Math.min(4, m));
        } else {
            System.out.println(m - 7 + 5);
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
