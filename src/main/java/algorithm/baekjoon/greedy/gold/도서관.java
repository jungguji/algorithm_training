package algorithm.baekjoon.greedy.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class 도서관 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nm = convertStringArrayToIntegerArray(br.readLine().split(" "));
            int[] positions = convertStringArrayToIntegerArray(br.readLine().split(" "));

            List<Integer> positive = new ArrayList<>();
            List<Integer> negative = new ArrayList<>();

            for (int position : positions) {
                if (position > 0) {
                    positive.add(position);
                } else {
                    negative.add(position);
                }
            }

            List<Integer> sortedPositive = positive.stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());

            List<Integer> sortedNegative = negative.stream()
                    .sorted()
                    .collect(Collectors.toList());

            List<Integer> answers = new ArrayList<>();

            int M = nm[1];
            for (int i = 0; i < sortedPositive.size(); i+=M) {
                if (sortedPositive.size() - i < M) {
                    answers.add(sortedPositive.get(i));
                    break;
                }

                answers.add(sortedPositive.get(i));
            }

            for (int i = 0; i < sortedNegative.size(); i+=M) {
                if (sortedNegative.size() - i < M) {
                    answers.add(Math.abs(sortedNegative.get(i)));
                    break;
                }

                answers.add(Math.abs(sortedNegative.get(i)));
            }

            int sum = answers.stream()
                    .mapToInt(i -> i * 2)
                    .sum();

            sum -= (answers.stream().mapToInt(i -> i).max().getAsInt());

            System.out.println(sum);
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
