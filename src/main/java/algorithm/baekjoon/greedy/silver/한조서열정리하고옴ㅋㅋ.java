package algorithm.baekjoon.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 한조서열정리하고옴ㅋㅋ {
    public static void main(String[] args) throws IOException {
        int[] array = convertStringArrayToIntegerArray(getInputData(System.in).split(" "));

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    max = count > max ? count : max;
                    break;
                } else if (array[i] > array[j]){
                    ++count;
                }
            }
        }

        System.out.println(max);
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            br.readLine();
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
