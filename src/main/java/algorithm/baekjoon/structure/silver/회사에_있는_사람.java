package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 회사에_있는_사람 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] input = br.readLine().split(" ");

            map.put(input[0], input[1]);
        }

        List<Map.Entry<String, String>> entries = map.entrySet().stream()
                .filter(s -> s.getValue().equals("enter")).sorted((s1, s2) -> s1.getKey().compareTo(s2.getKey())).collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for (int i = entries.size()-1; i > -1; i--) {
            Map.Entry<String, String> entry = entries.get(i);
            sb.append(entry.getKey()).append("\n");
        }

        System.out.println(sb);
    }
}
