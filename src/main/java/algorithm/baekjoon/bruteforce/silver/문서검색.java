package algorithm.baekjoon.bruteforce.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문서검색 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = solution(br.readLine(), br.readLine());

        System.out.println(max);
    }

    public static int solution(String str1, String str2) {
        char[] document = str1.toCharArray();
        char[] word = str2.toCharArray();

        int count = 0;

        int next = 1;
        for (int i = 0; i < document.length; i += next) {
            if (i + word.length > document.length) {
                break;
            }

            boolean isEquals = true;
            for (int j = 0; j < word.length; j++) {
                if (document[i + j] != word[j]) {
                    isEquals = false;
                    next = 1;
                    break;
                }
            }

            if (isEquals) {
                ++count;
                next = word.length;
            }
        }


        return count;
    }
}
