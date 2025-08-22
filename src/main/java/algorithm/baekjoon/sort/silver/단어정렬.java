package algorithm.baekjoon.sort.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class 단어정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        while (N-- > 0) {
            set.add(br.readLine());
        }

        StringBuilder sb = new StringBuilder();

        set.stream().sorted(
                    Comparator.comparingInt(String::length)
                            .thenComparing(String::compareTo)
                )
                .forEach(s -> sb.append(s).append("\n"));

        System.out.println(sb);
    }
}
