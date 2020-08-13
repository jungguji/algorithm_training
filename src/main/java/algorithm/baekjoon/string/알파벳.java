package algorithm.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 알파벳 {
    public static void main(String[] args) throws IOException {
        char[] word = getInputData(System.in).toCharArray();

        int[] alphabet = initAlphabetArray();

        for (int i = 0; i < word.length; i++) {
            if (alphabet[word[i] - 'a'] == -1) {
                alphabet[word[i] - 'a'] = i;
            }
        }

        for (int i : alphabet) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
        }
    }

    private static int[] initAlphabetArray() {
        int[] alphabet = new int[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }

        return alphabet;
    }
}
