package algorithm.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Duplicate_SSN {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Set<String> set = new TreeSet<>();
            Set<String> answer = new TreeSet<>();

            while (true) {
                String ssn = br.readLine();
                if ("000-00-0000".equals(ssn)) {
                    break;
                }

                if (!set.add(ssn)) {
                    answer.add(ssn);
                }
            }

            StringBuilder sb = new StringBuilder();
            for (String s : answer) {
                sb.append(s).append("\n");
            }

            System.out.println(sb);
        }
    }
}
