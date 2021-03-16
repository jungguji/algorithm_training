package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Maximum_Word_Frequency {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();

        int max = 0;
        String answer = "";
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String input = br.readLine();

            int count = map.getOrDefault(input, 0) + 1;
            map.put(input, count);

            if (count >= max) {
                max = count;
                answer = input.compareTo(answer) > 1 ? input : answer;
            }
        }

        System.out.println(answer + " " + max);
    }
}
