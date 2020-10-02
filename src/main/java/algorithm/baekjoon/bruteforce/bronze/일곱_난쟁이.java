package algorithm.baekjoon.bruteforce.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 일곱_난쟁이 {
    private static final int MAX = 9;
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            List<Integer> list = new ArrayList<>();
            int sum = 0;

            for (int i = 0 ; i < MAX; i++) {
                int value = Integer.parseInt(br.readLine());
                sum += value;

                list.add(value);
            }

            int[] deleteIndex = new int[2];
            for (int i = 0; i < MAX; i++) {
                int v1 = list.get(i);

                for (int j = 0; j < MAX; j++) {
                    int v2 = list.get(j);

                    if (v1 == v2) {
                        continue;
                    }

                    if (sum - (v1 + v2) == 100) {
                        deleteIndex[0] = i > j ? i : j;
                        deleteIndex[1] = i > j ? j : i;
                        break;
                    }
                }

                if (deleteIndex[0] + deleteIndex[1] > 0) {
                    break;
                }
            }

            list.remove(deleteIndex[0]);
            list.remove(deleteIndex[1]);

            Collections.sort(list);

            StringBuilder sb = new StringBuilder();

            for (int i : list) {
                sb.append(i).append("\n");
            }

            System.out.println(sb);
        }
    }
}
