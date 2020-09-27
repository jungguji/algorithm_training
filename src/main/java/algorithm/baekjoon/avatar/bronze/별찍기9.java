package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 별찍기9 {
    public static void main(String[] args) throws IOException {
        int input = Integer.parseInt(getInputData(System.in));

        int max = (input * 2) - 1;

        System.out.println(makeStar(input, max));
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
        }
    }

    private static String makeStar(int input, int max) {
        String[] stars = new String[input];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input; i++) {

            String empty = getEmpty((i * 1));
            String star = getStar(max);

            sb.append(empty).append(star).append("\n");

            stars[i] = empty + star + "\n";
            max -= 2;
        }

        for (int i = input - 2; i >= 0; i--) {
            sb.append(stars[i]);
        }

        return sb.toString();
    }

    private static String getEmpty(int i) {
        StringBuilder sb = new StringBuilder();
        while (i-- > 0) {
            sb.append(" ");
        }

        return sb.toString();
    }

    private static String getStar(int max) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            sb.append("*");
        }

        return sb.toString();
    }
}
