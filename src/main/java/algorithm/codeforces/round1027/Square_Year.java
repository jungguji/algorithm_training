package algorithm.codeforces.round1027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square_Year {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            while(t-- > 0) {
                String s = br.readLine();
                int n = Integer.parseInt(s);

                int sqrt = (int) Math.sqrt(n);

                if (sqrt * sqrt == n) {
                    sb.append("0 ").append(sqrt).append("\n");
                } else {
                    sb.append("-1").append("\n");
                }
            }

            System.out.print(sb);
        }
    }
}
