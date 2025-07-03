package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class 스택2 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            Stack<Integer> stack = new Stack<>();
            while (N-- > 0) {

                int[] 명령 = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                switch (명령[0]) {
                    case 1:
                        stack.push(명령[1]);
                        break;
                    case 2:
                        sb.append(stack.isEmpty() ? -1 : stack.pop());
                        break;
                    case 3:
                        sb.append(stack.size());
                        break;
                    case 4:
                        sb.append(stack.isEmpty() ? 1 : 0);
                        break;
                    case 5:
                        sb.append(stack.isEmpty() ? -1 : stack.peek());
                        break;
                }

                if (명령[0] != 1) {
                    sb.append("\n");
                }
            }

            System.out.println(sb);
        }
    }
}
