package algorithm.baekjoon.set.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 서로다른부분문자열의개수 {
    private static int length;
    private static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        length = S.length();

        /*
        수학적으론 안되고..
        재귀 돌면서 해야하나?
        시작위치
        0에서 깊이 추가하고,,?
        a, ab, aba, abab, ababc

        끝까지 갔으면  나오고 index 증가시키고?
        b, ba, bab, babc

        끝까지 갔으면  나오고 index 증가시키고?
        a, ab, abc 근데 a, ab는 중복이라 abc만

        끝까지 갔으면  나오고 index 증가시키고?
        b, bc, 중복이고 bc만

        끝까지 갔으면  나오고 index 증가시키고?
        c

         */

        for (int i = 0 ; i < length; ++i) {
            test(S, i, i);
        }

        System.out.println(set.size());
    }

    private static void test(String S, int start, int depth) {
        if (depth == length) {
            return;
        }

        set.add(S.substring(start, depth+1));
        test(S, start, depth+1);
    }
}
