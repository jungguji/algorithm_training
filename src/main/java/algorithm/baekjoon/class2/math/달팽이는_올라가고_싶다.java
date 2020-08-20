package algorithm.baekjoon.class2.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 달팽이는_올라가고_싶다 {
    public static void main(String[] args) throws IOException {
        String[] input = getInputData(System.in).split(" ");
        int[] abv = convertStringArrayToIntegerArray(input);

        System.out.println(solution(abv));
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

    public static int solution(int[] abv) {
        return (abv[2] - abv[1] - 1) / (abv[0] - abv[1]) + 1;
    }
}
