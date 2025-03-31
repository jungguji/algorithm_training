package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 모든_순열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solved(0, n, new Stack<>(), new boolean[n+1]);
    }

    private static void solved(int level, int n, Stack<Integer> stack, boolean[] check) {
        if (level == n) {
            StringBuilder sb = new StringBuilder();
            for (Integer i : stack) {
                sb.append(i).append(" ");
            }

            System.out.println(sb);

            return;
        }

        for (int i = 1; i <= n; i++) {
            if (check[i]) {
                continue;
            }

            stack.add(i);
            check[i] = true;

            solved(level+1, n, stack, check);

            stack.pop();
            check[i]= false;
        }
    }
}
