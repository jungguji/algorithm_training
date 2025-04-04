package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class 행운의_문자열 {

    private static Stack<Character> stack = new Stack<>();
    private static Map<Character, Integer> charCounts = new HashMap<>();
    private static int sLength;
    private static long answer;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s = br.readLine();
            sLength = s.length();

            for (char c : s.toCharArray()) {
                charCounts.put(c, charCounts.getOrDefault(c, 0)+1);
            }

            recursive(0);

            System.out.println(answer);
        }
    }

    private static void recursive(int depth) {
        if (depth == sLength) {
            ++answer;
            return;
        }

        for (Character c : charCounts.keySet()) {
            if (charCounts.get(c) > 0) {
                if (stack.isEmpty() || stack.peek() != c) {

                    charCounts.put(c, charCounts.get(c)-1);
                    stack.push(c);

                    recursive(depth+1);

                    stack.pop();
                    charCounts.put(c, charCounts.get(c)+1);
                }
            }
        }
    }
}
