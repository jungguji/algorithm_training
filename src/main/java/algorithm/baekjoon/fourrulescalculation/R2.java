package algorithm.baekjoon.fourrulescalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class R2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] r1s = convertStringArrayToIntegerArray(br.readLine().split(" "));

        System.out.println(r1s[1] * 2 - r1s[0]);
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
 