package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class 균형잡힌세상_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input;
        while (!Objects.equals(input = br.readLine(), ".")) {
            Stack<Character> s = new Stack<>();

            char[] charArray = input.toCharArray();
            for (char c : charArray) {
                if (c == '(') {
                    s.push(c);
                } else if (c == ')') {
                    if (s.isEmpty() || s.peek() != '(') {
                        s.push(c);
                        break;
                    }

                    s.pop();
                    continue;
                }

                if (c == '[') {
                    s.push(c);
                } else if (c == ']') {
                    if (s.isEmpty() || s.peek() != '[') {
                        s.push(c);
                        break;
                    }

                    s.pop();
                }
            }

            if (s.isEmpty()) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
