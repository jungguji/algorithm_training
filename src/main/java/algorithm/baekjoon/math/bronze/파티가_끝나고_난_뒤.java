package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 파티가_끝나고_난_뒤 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nm = convertStringArrayToIntegerArray(br.readLine().split(" "));

            int[] persons = convertStringArrayToIntegerArray(br.readLine().split(" "));

            int real = nm[0] * nm[1];
            StringBuilder sb = new StringBuilder();
            for (int i : persons) {
                sb.append(i - real).append(" ");
            }

            System.out.println(sb);
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

