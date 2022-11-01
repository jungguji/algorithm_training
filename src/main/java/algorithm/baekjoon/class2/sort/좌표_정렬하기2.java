package algorithm.baekjoon.class2.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 좌표_정렬하기2 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());

            List<int[]> list = new ArrayList<>();
            for (int i = 0; i < amount; i++) {
                int[] array = convertStringArrayToIntegerArray(br.readLine().split(" "));

                list.add(array);
            }

            Collections.sort(list, (a1, a2) -> a1[1] > a2[1] ? 1 : a1[1] < a2[1] ? -1 : a1[0] > a2[0] ? 1 : a1[0] < a2[0] ? -1 : 1);

            for (int[] i : list) {
                System.out.println(i[0] + " " + i[1]);
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
}
