package algorithm.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 단어의_개수 {

    public static void main(String[] args) throws IOException {
        String value = getInputData(System.in);
        long wordCount = solution(value);

        System.out.println(wordCount);
    }

    public static long solution(String args) {
        char[] tochar = args.trim().toCharArray();

        long answer = 0;
        if (tochar.length == 0) {
            return answer;
        }

        for (char ch : tochar) {
            if (ch == ' ') {
                ++answer;
            }
        }

        return answer + 1;
    }

    public static String getInputData(InputStream in) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        return br.readLine();
    }
}
