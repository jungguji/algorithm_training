package algorithm.baekjoon.structure.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class 국회의원_선거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();
        int dasom = Integer.parseInt(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            int input = Integer.parseInt(br.readLine());

            queue.offer(input);
        }

        Collections.sort(queue);

        int answer = 0;
        for (; !queue.isEmpty() && queue.peekLast() >= dasom; answer++) {
            if (queue.peek() < dasom) {
                queue.poll();
            }

            queue.offer((queue.pollLast() - 1));
            dasom++;

            Collections.sort(queue);
        }

        System.out.println(answer);
    }
}
