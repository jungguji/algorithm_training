package algorithm.baekjoon.set.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 붙임성좋은총총이 {
    private static final String ChongChong = "ChongChong";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        while (N-- > 0) {
            String[] s = br.readLine().split(" ");
            if (
                    ChongChong.equals(s[0]) || ChongChong.equals(s[1])
                    || set.contains(s[0]) || set.contains(s[1])
            ) {
                set.add(s[0]);
                set.add(s[1]);
            }
        }

        System.out.println(set.size());
    }
}
