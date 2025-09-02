package algorithm.baekjoon.set.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 문자열집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Set<String> S = new HashSet<>();
        // O(N)
        while (NM[0]-- > 0) {
            S.add(br.readLine());
        }

        int answer = 0;
        // O(M)
        while (NM[1]-- > 0) {
            String str = br.readLine();

            // O(M*N)
            if (S.contains(str)) {
                ++answer;
            }
        }

        // 최종 O(M*N)
        // 100000000
        System.out.println(answer);
    }
}
