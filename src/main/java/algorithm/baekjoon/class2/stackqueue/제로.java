package algorithm.baekjoon.class2.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());

            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < amount; i++) {
                int value = Integer.parseInt(br.readLine());

                if (value != 0) {
                    stack.push(value);
                } else if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            int sum = 0;
            for (int i : stack) {
                sum += i;
            }

            System.out.println(sum);
        }
    }
}
