package algorithm.baekjoon.set.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 대칭_차집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        Set<String> set0 = new HashSet<>(Arrays.asList(br.readLine().split(" ")));
        Set<String> set1 = new HashSet<>(Arrays.asList(br.readLine().split(" ")));

        int sum = 0;
        for (String s : set0) {
            if (!set1.contains(s)) {
                ++sum;
            }
        }

        for (String s : set1) {
            if (!set0.contains(s)) {
                ++sum;
            }
        }

        System.out.println(sum);
    }
}
