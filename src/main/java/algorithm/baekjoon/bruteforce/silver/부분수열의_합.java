package algorithm.baekjoon.bruteforce.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 부분수열의_합 {

    private static Stack<Integer> stack = new Stack<>();
    private static int[] array;
    private static int answer = 0;
    private static int N = 0;
    private static int S = 0;


    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] ns = convertStringArrayToIntegerArray(br.readLine().split(" "));

            N = ns[0];
            S = ns[1];
            array = convertStringArrayToIntegerArray(br.readLine().split(" "));

            for (int r = 1; r <= N; r++) {
                nCr(0, r);
            }

            System.out.println(answer);
        }
    }

    private static void nCr(int start, int r) {
        if (stack.size() == r) {
            int sum = 0;
            for (Integer i : stack) {
                sum += i;
            }

            if (sum == S) {
                ++answer;
            }

            return;
        }

        for (int i = start; i < N; i++) {
            stack.push(array[i]);

            nCr(i + 1, r);

            stack.pop();
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
