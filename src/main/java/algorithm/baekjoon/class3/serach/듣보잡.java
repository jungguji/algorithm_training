package algorithm.baekjoon.class3.serach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 듣보잡 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nmb = convertStringArrayToIntegerArray(br.readLine().split(" "));

            int n = nmb[0];
            int m = nmb[1];

            Set<String> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                set.add(br.readLine());
            }

            List<String> answers = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                String job = br.readLine();
                if (!set.add(job)) {
                    answers.add(job);
                }
            }

            Collections.sort(answers);

            System.out.println(answers.size());

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < answers.size(); i++) {
                sb.append(answers.get(i))
                        .append("\n");
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
}
