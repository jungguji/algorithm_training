package algorithm.baekjoon.set.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 인사성밝은곰곰이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        Set<String> set = new HashSet<>();
        while (N-- > 0) {
            String str = br.readLine();
            if ("ENTER".equals(str)) {
                set.clear();
                continue;
            }
            if (set.add(str)) {
                ++count;
            }
        }

        System.out.println(count);
    }
}
