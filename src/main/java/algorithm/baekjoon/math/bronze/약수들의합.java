package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 약수들의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String input = "";
        while (!((input = br.readLine()).equals("-1"))) {
            int n = Integer.parseInt(input);

            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < n; ++i) {
                if (n % i == 0) {
                    sum += i;
                    list.add(i);
                }
            }

            if (sum == n) {
                sb.append(n).append(" = ").append(list.get(0));

                for (int i = 1; i < list.size(); ++i) {
                    sb.append(" + ").append(list.get(i));
                }
            } else {
                sb.append(n).append(" is NOT perfect.");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
