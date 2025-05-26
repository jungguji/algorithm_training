package algorithm.baekjoon.twopointer.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 회문 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine());

            List<Integer> answers = new ArrayList<>();

            while (T-- > 0) {
                answers.add(solution(br.readLine()));
            }

            StringBuilder sb = new StringBuilder();
            for (Integer answer : answers) {
                sb.append(answer).append("\n");
            }

            System.out.println(sb);
        }
    }

    public static int solution(String context) {
        int left = 0;
        int right = context.length()-1;

        char[] array = context.toCharArray();

        while (left < right) {
            if (array[left] == array[right]) {
                ++left;
                --right;
            } else {
                if (isPalindrome(array, left + 1, right) || isPalindrome(array, left, right - 1)) {
                    return 1;
                } else {
                    return 2;
                }
            }
        }
        return 0;
    }

    private static boolean isPalindrome(char[] array, int left, int right) {
        while (left < right) {
            if (array[left++] != array[right--]) {
                return false;
            }
        }
        return true;
    }
}
