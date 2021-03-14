package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Open_Source {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            Map<String, Integer> openSource = new HashMap<>();
            Map<String, String> contributor = new HashMap<>();
            List<String> duplicate = new ArrayList<>();

            String input = "";
            String currentOpenSourceName = "";
            while (!"0".equals(input = br.readLine())) {
                if ("1".equals(input)) {

                    sb.append(getTestCaseResultMessage(openSource));

                    contributor = new HashMap<>();
                    openSource = new HashMap<>();
                    duplicate = new ArrayList<>();
                    currentOpenSourceName = "";

                    continue;
                }

                if (duplicate.contains(input)) {
                    continue;
                }

                if (contributor.containsKey(input)) {
                    String openSourceName = contributor.get(input);

                    if (!openSourceName.equals(currentOpenSourceName)) {
                        openSource.put(openSourceName, openSource.get(openSourceName) - 1);
                        duplicate.add(input);
                    }

                    continue;
                }

                char[] inputs = input.toCharArray();
                if (inputs[0] >= 'A' && inputs[0] <= 'Z') {
                    currentOpenSourceName = input;
                    openSource.put(currentOpenSourceName, 0);

                } else if (inputs[0] >= 'a' && inputs[0] <= 'z') {

                    if (!contributor.getOrDefault(input, "").equals(currentOpenSourceName)) {
                        openSource.put(currentOpenSourceName, openSource.getOrDefault(currentOpenSourceName, 0) + 1);
                    }

                    contributor.put(input, currentOpenSourceName);
                }
            }

            System.out.println(sb);
        }
    }

    private static String getTestCaseResultMessage(Map<String, Integer> openSource) {
        StringBuilder sb = new StringBuilder();

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(openSource.entrySet());

        Collections.sort(entries, (e1, e2) -> {
            if (e1.getValue() > e2.getValue()) {
                return 1;
            } else if (e1.getValue() < e2.getValue()) {
                return -1;
            } else {
                return e2.getKey().compareTo(e1.getKey());
            }
        });

        for (int i = entries.size() - 1; i > -1; i--) {
            Map.Entry<String, Integer> entry = entries.get(i);
            sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
        }

        return sb.toString();
    }
}
