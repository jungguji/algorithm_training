package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Cornell_Party_Retry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            Set<String> set = new HashSet<>();

            br.readLine();
            br.readLine();
            String[] cornells = br.readLine().split(" ");
            String[] whites = br.readLine().split(" ");

            for (String cornell : cornells) {
                set.add(cornell);
            }

            for (String white : whites) {
                set.add(white);
            }

            sb.append(set.size()).append("\n");
        }

        System.out.println(sb);
    }
}
