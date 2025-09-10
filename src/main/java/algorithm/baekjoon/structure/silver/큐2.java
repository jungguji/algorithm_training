package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class 큐2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Deque<String> queue = new ArrayDeque<>();
        while (N-- > 0) {
            String[] split = br.readLine().split(" ");

            switch (split[0]) {
                case "push" :
                    queue.offer(split[1]);
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? "-1" : queue.poll());
                    break;
                case "size":
                    sb.append(queue.size());
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? "1" : "0");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? "-1" : queue.peek());
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? "-1" : queue.getLast());
                    break;
            }

            if (!split[0].equals("push")) {
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
