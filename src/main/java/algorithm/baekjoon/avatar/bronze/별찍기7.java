package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int max = 2*N-1;

        StringBuilder sb = new StringBuilder();
        int star = 1;
        for (int i = 0; i < max; ++i) {
            if (i < N) {
                sb.append(" ".repeat(max-N-i)).append("*".repeat(star)).append("\n");
                star+=2;
            } else {
                star-=2;
                sb.append(" ".repeat(i-N+1)).append("*".repeat(star-2)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
