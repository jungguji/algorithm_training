package algorithm.baekjoon.class2.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 균형잡힌_세상 {
    private static final char SQUARE_BRACKET_LEFT = '[';
    private static final char SQUARE_BRACKET_RIGHT = ']';

    private static final char SMALL_BRACKET_LEFT = '(';
    private static final char SMALL_BRACKET_RIGHT = ')';

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String input = "";

            while (!(input = br.readLine()).equals(".")) {
                boolean answer = solution(input);

                System.out.println(answer ? "yes" : "no");
            }
        }
    }

    public static boolean solution(String args) {
        char[] charArray = args.toCharArray();

        Stack<Character> stack = new Stack<>();

        boolean success = true;
        for (char c : charArray) {
            switch (c) {
                case SMALL_BRACKET_LEFT:
                case SQUARE_BRACKET_LEFT:
                    stack.push(c);
                    break;

                case SMALL_BRACKET_RIGHT:
                    success = isRightBracketPop(stack, c, SMALL_BRACKET_LEFT);

                    break;

                case SQUARE_BRACKET_RIGHT:
                    success = isRightBracketPop(stack, c, SQUARE_BRACKET_LEFT);

                    break;
            }

            if (!success) {
                break;
            }
        }

        return stack.isEmpty();
    }

    private static boolean isRightBracketPop(Stack<Character> stack, char c, Character compare) {
        if (stack.isEmpty()) {
            stack.push(c);
        }

        boolean result = false;
        if (stack.peek() == compare) {
            stack.pop();
            result = true;
        }

        return result;
    }
}
