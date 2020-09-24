package algorithm.baekjoon.string.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아_알파벳 {
    private static final String[] CROATIA = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine();

            int answer = 0;
            while (input.length() != 0) {
                ++answer;
                int splitStartIndex = getSplitStartIndex(input);

                if (splitStartIndex == input.length()) {
                    break;
                }

                input = input.substring(splitStartIndex);
            }

            System.out.println(answer);
        }
    }

    private static int getSplitStartIndex(String input) {
        int splitStartIndex = 1;

        for (int i = 0; i < CROATIA.length; i++) {
            if (input.startsWith(CROATIA[i])) {
                splitStartIndex = CROATIA[i].length();
                break;
            }
        }

        return splitStartIndex;
    }
}
