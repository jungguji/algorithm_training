package algorithm.baekjoon.set.sliver;

import java.util.*;
import java.io.*;
import java.lang.*;

public class 회사에있는사람 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        while (n-- > 0) {
            String name = br.readLine().split(" ")[0];

            map.put(name, map.getOrDefault(name, -1)* -1);
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();

            if (value == 1) {
                list.add(entry.getKey());
            }
        }

        list.sort(Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        list.forEach(name -> sb.append(name).append("\n"));

        System.out.println(sb);
    }
}
