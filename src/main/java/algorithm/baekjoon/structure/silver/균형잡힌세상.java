package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class 균형잡힌세상 {
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
                } else if (c == ')'){
                    if (!s.isEmpty() && s.peek() == '(') {
                        s.pop();
                    } else {
                        s.push(c);
                        break;
                    }
                }

                if (c == '[') {
                    s.push(c);
                } else if (c == ']') {
                    if (!s.isEmpty() && s.peek() == '[') {
                        s.pop();
                    } else {
                        s.push(c);
                        break;
                    }
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
