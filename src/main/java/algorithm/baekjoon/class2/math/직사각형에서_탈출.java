package algorithm.baekjoon.class2.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 직사각형에서_탈출 {
    public static void main(String[] args) throws IOException {
        String[] input = getInputData(System.in).split(" ");
        int[] xywh = convertStringArrayToIntegerArray(input);

        int right = xywh[2] - xywh[0];
        int top = xywh[3] - xywh[1];
        int left = xywh[0];
        int bottom = xywh[1];

        System.out.println(Math.min(right, Math.min(left, Math.min(top, bottom))));
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
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
