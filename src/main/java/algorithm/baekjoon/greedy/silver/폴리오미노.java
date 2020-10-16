package algorithm.baekjoon.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 폴리오미노 {
    private static final String F1 = "AAAA";
    private static final String F2 = "BB";

    public static void main(String[] args) throws IOException {
        String str = getInputData(System.in);

        char[] array = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '.') {
                sb.append(".");
                continue;
            }

            int count = 0;
            while (i < array.length && array[i] == 'X') {
                ++count;
                ++i;
            }
            --i;

            if (isFail(count)) {
                sb.setLength(0);
                sb.append(-1);
                break;
            }

            sb.append(getText(count));
        }

        System.out.println(sb);
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
        }
    }

    private static boolean isFail(int count) {
        return count % 2 != 0;
    }

    private static String getText(int count) {
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < count / 4; j++) {
            sb.append(F1);
        }

        for (int j = 0; j < (count % 4) / 2; j++) {
            sb.append(F2);
        }

        return sb.toString();
    }
}
