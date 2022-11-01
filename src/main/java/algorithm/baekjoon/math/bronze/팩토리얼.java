package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        System.out.println(p(input));
    }

    public static int p(int n) {
        if (n < 2) {
            return 1;
        }

        return n * p(n - 1);
    }
}
