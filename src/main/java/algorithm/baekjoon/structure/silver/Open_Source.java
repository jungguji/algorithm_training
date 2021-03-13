package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Open_Source {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();

            Map<String, Integer> openSource = new HashMap<>();
            Map<String, String> contributor = new HashMap<>();


            String input = "";
            String currentOpenSourceName = "";
            while (!"1".equals(input = br.readLine())) {
                if (contributor.containsKey(input)) {
                    String openSourceName = contributor.get(input);

                    openSource.put(openSourceName, openSource.get(openSourceName) - 1);
                }

                char[] inputs = input.toCharArray();
                if (inputs[0] >= 'A' && inputs[0] <= 'Z') {
                    currentOpenSourceName = input;
                    openSource.put(currentOpenSourceName, 0);
                } else if (inputs[0] >= 'a' && inputs[0] <= 'z') {
                    if (contributor.containsValue(currentOpenSourceName)) {
                        openSource.put(currentOpenSourceName, openSource.getOrDefault(currentOpenSourceName, 0) + 1);
                    }
                    contributor.put(input, currentOpenSourceName);
                }
            }
            br.readLine();

            List<Map.Entry<String, Integer>> entries = openSource.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toList());

            for (Map.Entry<String, Integer> entry : entries) {
                sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
            }

            System.out.println(sb);
        }
    }
}
