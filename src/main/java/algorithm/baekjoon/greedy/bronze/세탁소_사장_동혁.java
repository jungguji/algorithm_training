package algorithm.baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세탁소_사장_동혁 {
    private static int QUARTER = 25;
    private static int DIME = 10;
    private static int NICKEL = 5;
    private static int PENNY = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int[] array = new int[] {QUARTER, DIME, NICKEL, PENNY};

        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < array.length; i++) {
                sb.append(n / array[i]).append(" ");
                n %= array[i];
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
