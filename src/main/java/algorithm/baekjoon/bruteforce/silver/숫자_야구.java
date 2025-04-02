package algorithm.baekjoon.bruteforce.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 숫자_야구 {

    private static List<Integer> permutation = new ArrayList<>();
    private static Stack<Integer> stack = new Stack<>();
    private static boolean[] checked = new boolean[10];

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            List<int[]> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int[] xyz = convertStringArrayToIntegerArray(br.readLine().split(" "));
                list.add(xyz);
            }

            npr(1, 0);

            int answer = 0;
            for (Integer i : permutation) {
                boolean fail = false;

                for (int[] ints : list) {
                    Compare compare = new Compare(ints[0], i);

                    if (compare.strike != ints[1] || compare.ball != ints[2]) {
                        fail = true;
                        break;
                    }
                }

                if (!fail) {
                    ++answer;
                }
            }

            System.out.println(answer);
        }
    }

    private static void npr(int index, int depth) {
        if (depth == 3) {
            permutation.add(
                (
                    (stack.get(0) * 100) +
                    (stack.get(1) * 10) +
                    (stack.get(2) * 1)
                )
            );
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (checked[i]) {
                continue;
            }

            checked[i] = true;
            stack.push(i);
            npr(index+1, depth+1);
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

    private static class Compare {
        private int strike;
        private int ball;

        private final ThreeDigitNumber attackNumber;
        private final ThreeDigitNumber checkNumber;

        private Compare(int attackNumber, int checkNumber) {
            this.attackNumber = new ThreeDigitNumber(attackNumber);
            this.checkNumber =  new ThreeDigitNumber(checkNumber);
            test();
        }

        private void test() {
            if (attackNumber.first == checkNumber.first) {
                ++this.strike;
            } else if (
                (attackNumber.first == checkNumber.second)
                || (attackNumber.first == checkNumber.third)
            ) {
                ++this.ball;
            }

            if (attackNumber.second == checkNumber.second) {
                ++this.strike;
            } else if (
                (attackNumber.second == checkNumber.first)
                || (attackNumber.second == checkNumber.third)
            ) {
                ++this.ball;
            }

            if (attackNumber.third == checkNumber.third) {
                ++this.strike;
            } else if (
                (attackNumber.third == checkNumber.first)
                || (attackNumber.third == checkNumber.second)
            ) {
                ++this.ball;
            }
        }
    }

    private static class ThreeDigitNumber {
        private int first;
        private int second;
        private int third;

        private ThreeDigitNumber(int number) {
            this.first = number / 100;
            this.second = (number % 100) / 10;
            this.third = number % 10;
        }
    }
}
