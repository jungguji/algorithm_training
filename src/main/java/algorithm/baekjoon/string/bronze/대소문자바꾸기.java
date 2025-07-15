package algorithm.baekjoon.string.bronze;

import java.io.*;

public class 대소문자바꾸기 {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            char[] charArray = br.readLine().toCharArray();

            for (int i = 0; i < charArray.length; ++i) {
                if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                    charArray[i] += 32;
                } else {
                    charArray[i] -= 32;
                }
            }

            bw.write(charArray);
            bw.flush();
        }
    }
}
