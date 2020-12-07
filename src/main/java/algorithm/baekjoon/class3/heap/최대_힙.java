package algorithm.baekjoon.class3.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class 최대_힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int amount = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        while (amount-- > 0) {
            int value = Integer.parseInt(br.readLine());

            if (value == 0) {
                sb.append(queue.isEmpty() ? "0" : queue.poll()).append("\n");
            } else {
                queue.add(value);
            }
        }

        System.out.println(sb);
    }
}
