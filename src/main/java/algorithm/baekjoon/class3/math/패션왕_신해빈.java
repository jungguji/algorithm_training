package algorithm.baekjoon.class3.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 패션왕_신해빈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (testcase-- > 0) {
            int clothes = Integer.parseInt(br.readLine());

            Map<String, Integer> map = new HashMap<>();
            while (clothes-- > 0) {
                String[] clothesAndCategory = br.readLine().split(" ");
                String category = clothesAndCategory[1];

                map.put(category, map.getOrDefault(category, 1) + 1);
            }

            int answer = 1;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                answer *= entry.getValue();
            }

            sb.append(--answer).append("\n");
        }

        System.out.println(sb);
    }
}
