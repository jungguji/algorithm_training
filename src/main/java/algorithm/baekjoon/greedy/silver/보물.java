package algorithm.baekjoon.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class 보물 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int[] A = convertStringArrayToIntegerArray(br.readLine().split(" "));
            int[] B = convertStringArrayToIntegerArray(br.readLine().split(" "));

            List<Integer> a = Arrays.stream(A)
                    .sorted()
                    .boxed()
                    .collect(Collectors.toList());

            List<Integer> b = Arrays.stream(B)
                    .sorted()
                    .boxed()
                    .collect(Collectors.toList())
                    .stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());

            System.out.println(S(a,b));
        }
    }

    private static int S(List<Integer> a, List<Integer> b) {
        int answer = 0;
        for (int i = 0; i < a.size(); i++) {
            answer += a.get(i) * b.get(i);
        }

        return answer;
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
