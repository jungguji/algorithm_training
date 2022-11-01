package algorithm.programmers.level2.practice;

import java.util.Stack;

public class 올바른_괄호 {
    boolean solution(String s) {
        boolean answer = true;
        char[] tochar = s.toCharArray();

        Stack<Character> stack = new Stack<Character>();
        for (char c : tochar) {
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        answer = false;
                        break;
                    }

                    stack.pop();
                    break;
            }
        }

        if (!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}
