package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Judging_Troubles {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Boolean> isDuplicate = new HashMap<>();
        Map<String, Integer> domJudge = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (!isDuplicate.containsKey(input)) {
                isDuplicate.put(input, false);
            }

            domJudge.put(input, domJudge.getOrDefault(input, 0) + 1);
        }

        Map<String, Integer> kattis = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (isDuplicate.containsKey(input)) {
                isDuplicate.put(input, true);
            }

            kattis.put(input, kattis.getOrDefault(input, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entries1 = new ArrayList<>(domJudge.entrySet());
        List<Map.Entry<String, Integer>> entries2 = new ArrayList<>(kattis.entrySet());

        entries1.addAll(entries2);
        Collections.sort(entries1, (e1, e2) -> {
            if (e1.getKey().compareTo(e2.getKey()) > 0) {
                return 1;
            } else if (e1.getKey().compareTo(e2.getKey()) < 0) {
                return -1;
            } else {
                return Integer.compare(e1.getValue(), e2.getValue());
            }
        });

        int answer = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < entries1.size(); i++) {
            Map.Entry<String, Integer> entry = entries1.get(i);

            if (isDuplicate.getOrDefault(entry.getKey(), false) && set.add(entry.getKey())) {
                answer += entry.getValue();
            }
        }

        System.out.println(answer);
    }
}