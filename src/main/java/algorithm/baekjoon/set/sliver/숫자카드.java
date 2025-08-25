package algorithm.baekjoon.set.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 숫자카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Map<Integer, Boolean> 상근이카드 = new HashMap<>();
        for (int i : array) {
            상근이카드.put(i, true);
        }

        br.readLine();
        int[] M = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        StringBuilder sb = new StringBuilder();
        for (int i : M) {
            if (상근이카드.getOrDefault(i, false)) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
