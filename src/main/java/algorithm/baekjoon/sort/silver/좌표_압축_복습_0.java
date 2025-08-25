package algorithm.baekjoon.sort.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 좌표_압축_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] original = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            original[i] = array[i];
        }

        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(array);

        int index = 0;
        for (int i : array) {
            if (!map.containsKey(i)) {
                map.put(i, index++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : original) {
            sb.append(map.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}
