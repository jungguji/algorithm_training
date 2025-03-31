package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class N과M_1 {

    private static boolean[] checked;
    private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = convertStringArrayToIntegerArray(br.readLine().split(" "));

        checked = new boolean[nm[0]+1];

        solved(nm[0], nm[1], 0);
    }

    private static void solved(int n, int m, int level) {
        if (level == m) {
            StringBuilder sb = new StringBuilder();

            for (Integer i : stack) {
                sb.append(i).append(" ");
            }

            System.out.println(sb);

            return;
        }

        for (int i = 1; i <= n; i++) {
            if (checked[i]) {
                continue;
            }

            stack.add(i);
            checked[i] = true;

            solved(n, m, level+1);

            stack.pop();
            checked[i] = false;
        }
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }
}
