package algorithm.baekjoon.class2.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class 통계학 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());

            int sum = 0;
            Map<Integer, Integer> map = new HashMap<>();
            int[] numbers = new int[amount];

            for (int i = 0; i < amount; i++) {
                int value = Integer.parseInt(br.readLine());

                numbers[i] = value;
                sum += value;

                if (!map.containsKey(value)) {
                    map.put(value, 0);
                }

                map.put(value, map.get(value) + 1);
            }

            Arrays.sort(numbers);

            int[] answers = new int[4];
            answers[0] = (int) Math.round((sum / (double) amount));
            answers[1] = numbers[amount >>> 1];
            answers[2] = getFrequentValue(map);
            answers[3] = numbers[amount - 1] - numbers[0];

            for (int i : answers) {
                System.out.println(i);
            }
        }
    }

    private static int getFrequentValue(Map<Integer, Integer> map) {
        int maxValue = map.entrySet()
                .parallelStream()
                .max((e1, e2) -> Integer.compare(e1.getValue(), e2.getValue()))
                .get()
                .getValue();

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int currentValue = entry.getValue();

            if (maxValue == currentValue) {
                queue.offer(entry.getKey());
            }
        }

        if (queue.size() > 1) {
            queue.poll();
        }

        return queue.poll();
    }
}
