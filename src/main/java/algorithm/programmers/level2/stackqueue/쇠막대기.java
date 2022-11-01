package algorithm.programmers.level2.stackqueue;

import java.util.Stack;

public class 쇠막대기 {
    public int solution(String arrangement) {
        char[] ch = arrangement.toCharArray();

        int answer = 0;
        char pre = 0;
        Stack<Character> stack = new Stack<Character>();
        for (char c : ch) {
            if (c == '(') {
                stack.push(c);
            } else {
                stack.pop();
                if (pre == c) {
                    answer += 1;
                } else {
                    answer += stack.size();
                }
            }

            pre = c;
        }

        return answer;
    }
}
