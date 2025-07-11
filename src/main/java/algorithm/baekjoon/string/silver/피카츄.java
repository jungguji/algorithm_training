package algorithm.baekjoon.string.silver;

import java.io.*;

public class 피카츄 {

    private static final String[] 발음 = new String[] {"pi", "ka", "chu"};

    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String S = br.readLine();

            for (String s : 발음) {
                S = S.replace(s, "1");
            }

            if ("1".repeat(S.length()).equals(S)) {
                bw.write("YES");
            } else {
                bw.write("NO");
            }

            bw.flush();
        }
    }
}
