package algorithm.baekjoon.fourrulescalculation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 심부름_가는_길 {
    private static final int POINT = 4;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int second = 0;
        for (int i = 0; i < POINT; i++) {
            second += Integer.parseInt(br.readLine());
        }

        System.out.println(second / 60);
        System.out.println(second % 60);
    }
}
