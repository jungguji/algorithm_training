package algorithm.baekjoon.sort.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 소트인사이드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = convertStringArrayToIntegerArray(br.readLine().split(""));

        Arrays.sort(array);

        StringBuilder sb = new StringBuilder();
        for (int i = array.length- 1; i >= 0; i--) {
            sb.append(array[i]);
        }

        System.out.println(sb);
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
