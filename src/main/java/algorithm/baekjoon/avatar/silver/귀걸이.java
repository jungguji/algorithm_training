package algorithm.baekjoon.avatar.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 귀걸이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> result = new ArrayList<>();

        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            boolean[] array = new boolean[n + 1];
            List<String> names = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                names.add(br.readLine());
            }

            for (int i = 0; i < (n * 2) - 1; i++) {
                String numberAndAB = br.readLine();
                int number = Integer.parseInt(numberAndAB.split(" ")[0]);

                array[number] = !array[number];
            }

            for (int i = 0; i <= n; i++) {
                if (array[i]) {
                    result.add(names.get(i - 1));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            sb.append(i + 1).append(" ").append(result.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}
