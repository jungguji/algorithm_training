package algorithm.baekjoon.bruteforce.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 백설공주와_일곱난쟁이 {
    private static final int MAX = 9;
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            List<Integer> dwarfs = new ArrayList<>();

            int sum = 0;
            for (int i = 0; i < MAX; i++) {
                int value = Integer.parseInt(br.readLine());

                dwarfs.add(value);
                sum += value;
            }

            int[] removeIndex = getRemoveDwarfs(dwarfs, sum);

            dwarfs.remove(removeIndex[0]);
            dwarfs.remove(removeIndex[1]);

            System.out.println(convertListToString(dwarfs));
        }
    }

    private static int[] getRemoveDwarfs(List<Integer> dwarfs, int sum) {
        int[] removeIndex = new int[2];

        for (int i = 0; i < MAX; i++) {
            int v1 = dwarfs.get(i);

            for (int j = 0; j < MAX; j++) {
                if (i == j) {
                    continue;
                }

                int v2 = dwarfs.get(j);

                if (sum - (v1 + v2) == 100) {
                    removeIndex[0] = i > j ? i : j;
                    removeIndex[1] = i > j ? j : i;

                    break;
                }
            }

            if (removeIndex[0] + removeIndex[1] > 0) {
                break;
            }
        }

        return removeIndex;
    }

    private static String convertListToString(List<Integer> dwarfs) {
        StringBuilder sb = new StringBuilder();
        for (int i : dwarfs) {
            sb.append(i).append("\n");
        }

        return sb.toString();
    }
}
