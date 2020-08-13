package algorithm.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈 {
    private static final char O = 'O';

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());

            for (int i = 0; i < amount; i++) {
                char[] array = br.readLine().toCharArray();

                int score = getScore(array);

                System.out.println(score);
            }
        }
    }

    private static int getScore(char[] array) {
        int sum = 0;
        int currentValue = 0;

        for (char ch : array) {
            if (ch == O) {
                sum += ++currentValue;
            } else {
                currentValue = 0;
            }
        }

        return sum;
    }
}
