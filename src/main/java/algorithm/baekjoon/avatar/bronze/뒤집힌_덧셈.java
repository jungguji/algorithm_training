package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 뒤집힌_덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] xy = convertStringArrayToIntegerArray(br.readLine().split(" "));

        System.out.println(rev(rev(xy[0]) + rev(xy[1])));
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }

    private static int rev(int value) {
        int newValue = 0;
        int i = 0;
        while (value != 0) {
            newValue = newValue * 10 + value % 10;
            value /= 10;

            i++;
        }
        return newValue;
    }
}
