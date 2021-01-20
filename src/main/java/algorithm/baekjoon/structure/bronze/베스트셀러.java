package algorithm.baekjoon.structure.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class 베스트셀러 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;

        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<String> queue = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String key = br.readLine();
            map.put(key, map.getOrDefault(key, 0) + 1);

            int current = map.get(key);
            if (max < current) {
                while (!queue.isEmpty()) {
                    queue.poll();
                }
                queue.offer(key);
                max = current;
            } else if (max == current) {
                queue.offer(key);
            }
        }

        System.out.println(queue.poll());
    }
}
