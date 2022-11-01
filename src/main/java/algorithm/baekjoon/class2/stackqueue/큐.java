package algorithm.baekjoon.class2.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 큐 {
    private static final String PUSH = "push";
    private static final String POP = "pop";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String FRONT = "front";
    private static final String BACK = "back";

    private static final String queue_EMPTY_VALUE = "-1";

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int amount = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();

            LinkedList<Integer> queue = new LinkedList<>();
            while (amount > 0) {
                --amount;

                String command = br.readLine();

                if (command.startsWith(PUSH)) {
                    int value = Integer.parseInt(command.split(" ")[1]);

                    queue.offer(value);
                    continue;
                }

                if (POP.equals(command)) {
                    sb.append(queue.isEmpty() ? queue_EMPTY_VALUE : queue.poll());
                } else if (SIZE.equals(command)) {
                    sb.append(queue.size());
                } else if (EMPTY.equals(command)) {
                    sb.append(queue.isEmpty() ? "1" : "0");
                } else if (FRONT.equals(command)) {
                    sb.append(queue.isEmpty() ? queue_EMPTY_VALUE : queue.peek());
                } else if (BACK.equals(command)) {
                    sb.append(queue.isEmpty() ? queue_EMPTY_VALUE : queue.peekLast());
                }

                sb.append("\n");
            }

            System.out.println(sb);
        }
    }
}
