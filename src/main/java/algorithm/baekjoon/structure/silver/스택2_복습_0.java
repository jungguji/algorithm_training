package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class 스택2_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        while (N-- > 0) {
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int command = array[0];

            switch (command) {
                case 1:
                    stack.push(array[1]);
                    break;
                case 2:
                    sb.append(stack.isEmpty() ? -1 : stack.pop());
                    sb.append("\n");
                    break;
                case 3:
                    sb.append(stack.size());
                    sb.append("\n");
                    break;
                case 4:
                    sb.append(stack.isEmpty() ? 1 : 0);
                    sb.append("\n");
                    break;
                case 5:
                    sb.append(stack.isEmpty() ? -1 : stack.peek());
                    sb.append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
