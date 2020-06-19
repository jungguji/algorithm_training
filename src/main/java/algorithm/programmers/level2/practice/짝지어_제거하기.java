package algorithm.programmers.level2.practice;

import java.util.Stack;

public class 짝지어_제거하기 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<Character>();

        char[] tochar = s.toCharArray();

        for (char ch : tochar) {
            if (!stack.empty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        return stack.empty() ? 1 : 0;
    }
}
