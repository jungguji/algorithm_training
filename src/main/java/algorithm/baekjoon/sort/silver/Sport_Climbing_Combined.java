package algorithm.baekjoon.sort.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sport_Climbing_Combined {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            List<int[]> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int[] bpqr = convertStringArrayToIntegerArray(br.readLine().split(" "));

                list.add(
                        new int[]{bpqr[0], (bpqr[1]) * (bpqr[2]) * (bpqr[3]), (bpqr[1]) + (bpqr[2]) + (bpqr[3])}
                );
            }

            list.sort(
                    Comparator.comparingInt((int[] arr) -> arr[1])
                            .thenComparingInt((arr) -> arr[2])
                            .thenComparingInt((arr) -> arr[0])
            );

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                sb.append(list.get(i)[0]).append(" ");
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
