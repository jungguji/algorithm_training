package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 칸토어_집합_with_lecture {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            while ((input = br.readLine()) != null) {
                int n = Integer.parseInt(input);
                System.out.println(getCantor(n));
            }
        }
    }

    public static String getCantor(int n) {
        if (n == 0) {
            return "-";
        }

        String prev = getCantor(n - 1);
        String space = " ".repeat((int) Math.pow(3, n - 1));

        return prev + space + prev;
    }
}
