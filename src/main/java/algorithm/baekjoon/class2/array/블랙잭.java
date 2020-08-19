package algorithm.baekjoon.class2.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 블랙잭 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] countAndValue = convertStringArrayToIntegerArray(br.readLine().split(" "));

            int blackjack = countAndValue[1];

            int[] cardNumber = convertStringArrayToIntegerArray(br.readLine().split(" "));

            int answer = solution(blackjack, cardNumber);

            System.out.println(answer);
        }
    }

    public static int solution(int blackjack, int[] cardNumber) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        perm(blackjack, 0, new boolean[cardNumber.length], cardNumber, new Stack<>(), stack);

        return stack.pop();
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }

    private static void perm(int blackjack, int depth, boolean[] isVisit, int[] cardNumber, Stack<Integer> stack, Stack<Integer> answer) {
        if (depth == 3) {
            int value = 0;
            for (int i : stack) {
                value += i;
            }

            if (value <= blackjack && answer.peek() < value) {
                answer.pop();
                answer.push(value);
            }

            return;
        }

        for (int i = 0; i < cardNumber.length; i++) {
            if (!isVisit[i]) {
                isVisit[i] = true;
                stack.push(cardNumber[i]);
                perm(blackjack, depth + 1, isVisit, cardNumber, stack, answer);
                stack.pop();
                isVisit[i] = false;

            }
        }
    }
}
