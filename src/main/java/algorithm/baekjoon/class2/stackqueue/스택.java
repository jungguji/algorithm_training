package algorithm.baekjoon.class2.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택 {
    private static final String PUSH = "push";
    private static final String POP = "pop";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String TOP = "top";

    private static final String STACK_EMPTY_VALUE = "-1";

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int amount = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();

            Stack<Integer> stack = new Stack<>();
            while (amount > 0) {
                --amount;

                String command = br.readLine();

                if (command.startsWith(PUSH)) {
                    int value = Integer.parseInt(command.split(" ")[1]);

                    stack.push(value);
                    continue;
                }

                if (POP.equals(command)) {
                    sb.append(stack.isEmpty() ? STACK_EMPTY_VALUE : stack.pop());
                } else if (SIZE.equals(command)) {
                    sb.append(stack.size());
                } else if (EMPTY.equals(command)) {
                    sb.append(stack.isEmpty() ? "1" : "0");
                } else if (TOP.equals(command)) {
                    sb.append(stack.isEmpty() ? STACK_EMPTY_VALUE : stack.peek());
                }

                sb.append("\n");
            }

            System.out.println(sb);
        }
    }
}
