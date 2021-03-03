package algorithm.baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 컵홀더 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        String input = br.readLine();

        int answer = 0;
        if (!input.contains("LL")) {
            answer = input.length();
        } else {
            char[] chars = input.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char ch = chars[i];

                if ('L' == ch) {
                    ++i;
                }

                answer += 1;
            }

            ++answer;
        }

        System.out.println(answer);
    }

}
