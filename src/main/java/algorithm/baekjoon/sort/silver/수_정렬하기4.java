package algorithm.baekjoon.sort.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 수_정렬하기4 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int amount = Integer.parseInt(br.readLine());

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < amount; i++) {
                list.add(Integer.parseInt(br.readLine()));
            }

            Collections.sort(list);

            StringBuilder sb = new StringBuilder();
            for (int i = list.size() - 1; i > -1; i--) {
                sb.append(list.get(i)).append("\n");
            }

            System.out.println(sb);
        }
    }
}
