package algorithm.baekjoon.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class 최소_힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int amount = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 0; i < amount; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value == 0) {
                System.out.println(queue.isEmpty() ? "0" : queue.poll());
            } else {
                queue.add(value);
            }
        }
    }
}
