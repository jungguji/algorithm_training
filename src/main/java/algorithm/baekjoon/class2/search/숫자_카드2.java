package algorithm.baekjoon.class2.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 숫자_카드2 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            int[] hand = convertStringArrayToIntegerArray(br.readLine().split(" "));

            br.readLine();
            int[] numbers = convertStringArrayToIntegerArray(br.readLine().split(" "));

            int[] answer = solution(hand, numbers);

            StringBuilder sb = new StringBuilder();
            for (int i : answer) {
                sb.append(i).append(" ");
            }

            System.out.println(sb);
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

    public static int[] solution(int[] hand, int[] numbers) {
        Arrays.sort(hand);

        int[] answer = new int[numbers.length];

        Map<Integer, Integer> map = getCard(hand);

        int index = 0;
        for (int i : numbers) {
            int value = Arrays.binarySearch(hand, i);

            if (value < 0) {
                answer[index] = 0;
            } else {
                answer[index] = map.get(i);
            }

            ++index;
        }

        return answer;
    }

    private static Map<Integer, Integer> getCard(int[] hand) {
        Map<Integer, Integer> map = new HashMap<>();

        Set<Integer> set = new HashSet<>();
        for (int i : hand) {
            if (set.add(i)) {
                map.put(i, 0);
            }

            map.put(i, map.get(i) + 1);
        }

        return map;
    }
}
