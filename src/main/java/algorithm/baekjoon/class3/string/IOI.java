package algorithm.baekjoon.class3.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.readLine();

        int answer = solution(n, br.readLine());

        System.out.println(answer);
    }

    public static int solution(int n, String target) {
        int answer = 0;

        char[] s = target.toCharArray();
        char[] targetString = getTargetString(n).toCharArray();
        int[] fail = failFunction(targetString);

        int start = 0;
        int m = 0;

        while (start <= s.length - targetString.length) {
            if (m < targetString.length && s[start + m] == targetString[m]) {
                ++m;
                if (m == targetString.length) {
                    answer++;
                }
            } else {
                if  (m == 0) {
                    start++;
                } else {
                    start += (m - fail[m - 1]);
                    m = fail[m - 1];
                }
            }
        }

        return answer;
    }

    private static String getTargetString(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append("I");

        while (n-- > 0) {
            sb.append("OI");
        }
        return sb.toString();
    }

    private static int[] failFunction(char[] target) {
        int n = target.length;
        int[] fail = new int[n];

        int start = 1;
        int m = 0;

        while (start + m < n) {
            if (target[start + m] == target[m]) {
                m++;
                fail[start + m - 1] = m;
            } else {
                if (m == 0) {
                    start++;
                } else {
                    start += (m - fail[m - 1]);
                    m = fail[m - 1];
                }
            }
        }

        return fail;
    }
}
