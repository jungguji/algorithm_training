package algorithm.baekjoon.recursive.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 재귀의귀재 {

    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            count = 0;
            String S = br.readLine();
            int palindrome = isPalindrome(S);
            sb.append(palindrome).append(" ").append(count).append("\n");
        }

        System.out.println(sb);
    }

    private static int isPalindrome(String S) {
        return recursion(S.toCharArray(), 0, S.length()-1);
    }

    private static int recursion(char[] s, int l, int r) {
        ++count;
        if (l >= r) {
            return 1;
        } else if (s[l] != s[r]) {
            return 0;
        } else {
            return recursion(s, ++l, --r);
        }
    }
}
