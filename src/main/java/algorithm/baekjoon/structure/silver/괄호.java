package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int check = 0;
            char[] charArray = br.readLine().toCharArray();

            for (char c : charArray) {
                if (check < 0) {
                    break;
                }

                if (c == '(') {
                    ++check;
                } else {
                    --check;
                }
            }

            if (check != 0) {
                sb.append("NO");
            } else {
                sb.append("YES");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
