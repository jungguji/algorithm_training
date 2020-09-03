package algorithm.baekjoon.class2.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 카드2 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int value = Integer.parseInt(br.readLine());

            LinkedList<Integer> queue = new LinkedList<>();
            for (int i = 1; i <= value; i++) {
                queue.offer(i);
            }

            while (queue.size() != 1) {
                queue.poll();
                queue.offer(queue.poll());
            }

            System.out.println(queue.poll());
        }
    }
}
