package algorithm.baekjoon.fourrulescalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 카드_게임 {
    private static int N = 5;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (N-- > 0) {
            sum += Integer.parseInt(br.readLine());
        }

        System.out.println(sum);
    }
}
