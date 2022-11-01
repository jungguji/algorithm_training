package algorithm.baekjoon.class2.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class 스택_수열 {
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String ENTER = "\n";

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());

            LinkedList<Integer> sequence = initSequence(br, amount);

            StringBuilder answer = new StringBuilder();
            Stack<Integer> stack = new Stack<>();
            int max = 1;

            StringBuilder input = new StringBuilder();
            StringBuilder output = new StringBuilder();

            while (!sequence.isEmpty()) {
                int current = sequence.poll();
                input.append(current);

                for (int i = max; i <= amount; i++) {
                    if (!stack.isEmpty() && (current <= stack.peek())) {
                        output.append(stack.pop());
                        answer.append(MINUS).append(ENTER);

                        max = i;
                        break;
                    }

                    stack.push(i);
                    answer.append(PLUS).append(ENTER);

                }
            }

            if (!stack.isEmpty()) {
                output.append(stack.pop());
                answer.append(MINUS);
            }

            System.out.println(!output.toString().equals(input.toString()) ? "NO" : answer);
        }
    }

    private static LinkedList<Integer> initSequence(BufferedReader br, int amount) throws IOException {
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < amount; i++) {
            queue.offer(Integer.parseInt(br.readLine()));
        }

        return queue;
    }
}
