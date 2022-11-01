package algorithm.baekjoon.string.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹_단어_체커 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int answer = 0;

            int amount = Integer.parseInt(br.readLine());
            while (amount-- > 0) {
                char[] array = br.readLine().toCharArray();

                if (!isGroupWord(array)) {
                    continue;
                }

                ++answer;
            }

            System.out.println(answer);
        }
    }

    private static boolean isGroupWord(char[] array) {
        boolean isGroupWord = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == array[i]) {
                continue;
            }

            for (int j = i; j < array.length; j++) {
                if (array[i - 1] == array[j]) {
                    isGroupWord = false;
                    break;
                }
            }

            if (!isGroupWord) {
                break;
            }
        }

        return isGroupWord;
    }
}
