package algorithm.baekjoon.math.silver;

import java.io.*;

public class 수들의합 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long S = Integer.parseInt(br.readLine());

            double D = Math.sqrt(1 + 8L * S);
            System.out.println((long) Math.floor((-1 + D) / 2));
        }
    }
}
