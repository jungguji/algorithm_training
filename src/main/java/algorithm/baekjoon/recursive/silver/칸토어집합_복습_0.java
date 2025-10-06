package algorithm.baekjoon.recursive.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 칸토어집합_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while ((input = br.readLine()) != null) {
            int N = Integer.parseInt(input);
            String recursive = recursive(N);
            System.out.println(recursive);
        }
    }

    private static String recursive(int length) {
        /*
        가장 작은 상태가 선의 길이가 1인 상태
        0이면 -
        1이면 - -
        2면 - -   - -
        3 - -   - -         - -   - -
         */
        if (length == 0) {
            return "-";
        }

        String prev = recursive(length-1);
        String empty = " ".repeat((int) Math.pow(3, length-1));

        return prev + empty + prev;
    }
}
