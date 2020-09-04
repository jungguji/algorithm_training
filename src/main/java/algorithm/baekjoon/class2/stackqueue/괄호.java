package algorithm.baekjoon.class2.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호 {

    private static final char BRACKET_LEFT = '(';

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int amount = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < amount; i++) {
                 sb.append((isVPS(br.readLine()) ? "YES" : "NO") + "\n");
            }

            System.out.println(sb.toString());
        }
    }

    public static boolean isVPS(String args) {
        char[] charArray = args.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : charArray) {
            if (c == BRACKET_LEFT) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    stack.push(c);
                    break;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
