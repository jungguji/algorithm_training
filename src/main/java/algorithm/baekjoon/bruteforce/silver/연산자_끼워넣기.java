package algorithm.baekjoon.bruteforce.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 연산자_끼워넣기 {

    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVINATION = '/';

    private static Stack<Character> stack = new Stack<>();
    private static boolean[] checked;

    private static int N;
    private static int[] A;

    private static long max = Long.MIN_VALUE;
    private static long min = Long.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());
            A = convertStringArrayToIntegerArray(br.readLine().split(" "));
            int[] o = convertStringArrayToIntegerArray(br.readLine().split(" "));

            char[] operators = getOperators(o);
            checked = new boolean[N];

            recursive(A[0], 1, 0, operators);

            System.out.println(max);
            System.out.println(min);
        }
    }

    private static void recursive(int sum, int index, int depth, char[] operators) {
        if (depth == N-1) {
            if (max < sum) {
                max = sum;
            }

            if (min > sum) {
                min = sum;
            }

            return;
        }

        for (int i = 1; i < N; i++) {
            if (checked[i]) {
                continue;
            }

            int currentSum = 0;
            char operator = operators[i - 1];
            switch (operator) {
                case ADDITION:
                    currentSum = sum + A[index];
                    break;
                case SUBTRACTION:
                    currentSum = sum - A[index];
                    break;
                case MULTIPLICATION:
                    currentSum = sum * A[index];
                    break;
                case DIVINATION:
                    currentSum = sum < 0 ? -(-sum / A[index]) : sum / A[index];
                    break;
            }

            stack.push(operator);
            checked[i] = true;

            recursive(currentSum, index+ 1,depth + 1, operators);

            stack.pop();
            checked[i] = false;
        }
    }

    private static char[] getOperators(int[] o) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o[i]; j++) {
                switch (i) {
                    case 0:
                        sb.append("+");
                        break;
                    case 1:
                        sb.append("-");
                        break;
                    case 2:
                        sb.append("*");
                        break;
                    case 3:
                        sb.append("/");
                        break;
                }
            }
        }

        return sb.toString().toCharArray();
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
