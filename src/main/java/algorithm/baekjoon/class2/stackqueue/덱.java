package algorithm.baekjoon.class2.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 덱 {
    private static final String PUSH_FRONT = "push_front";
    private static final String PUSH_BACK = "push_back";
    private static final String POP_FRONT = "pop_front";
    private static final String POP_BACK = "pop_back";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String FRONT = "front";
    private static final String BACK = "back";

    private static final String DEQUE_EMPTY_VALUE = "-1";

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int amount = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();

            LinkedList<Integer> deque = new LinkedList<>();
            while (amount > 0) {
                --amount;

                String command = br.readLine();

                if (command.startsWith(PUSH_FRONT)) {
                    int value = Integer.parseInt(command.split(" ")[1]);

                    deque.addFirst(value);
                    continue;
                }

                if (command.startsWith(PUSH_BACK)) {
                    int value = Integer.parseInt(command.split(" ")[1]);

                    deque.addLast(value);
                    continue;
                }

                if (POP_FRONT.equals(command)) {
                    sb.append(deque.isEmpty() ? DEQUE_EMPTY_VALUE : deque.pollFirst());
                } else if (POP_BACK.equals(command)) {
                    sb.append(deque.isEmpty() ? DEQUE_EMPTY_VALUE : deque.pollLast());
                } else if (SIZE.equals(command)) {
                    sb.append(deque.size());
                } else if (EMPTY.equals(command)) {
                    sb.append(deque.isEmpty() ? "1" : "0");
                } else if (FRONT.equals(command)) {
                    sb.append(deque.isEmpty() ? DEQUE_EMPTY_VALUE : deque.peek());
                } else if (BACK.equals(command)) {
                    sb.append(deque.isEmpty() ? DEQUE_EMPTY_VALUE : deque.peekLast());
                }

                sb.append("\n");
            }

            System.out.println(sb);
        }
    }
}
