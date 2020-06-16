package algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대회or인턴 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] nmk = getNMK(input);

        int answer = getMaxTeamCount(nmk[0], nmk[1], nmk[2]);
        System.out.println(answer);
    }

    private static int[] getNMK(String input) {
        String[] split = input.split(" ");
        int[] result = new int[split.length];

        int i = 0;
        for (String str : split) {
            result[i] = Integer.parseInt(split[i]);
            ++i;
        }

        return result;
    }

    public static int getMaxTeamCount(int n, int m, int k) {
        while (k != 0) {
            if (m * 2 > n) {
                m -= 1;
            } else {
                n -= 1;
            }

            --k;
        }

        return m * 2 > n ? n / 2 : m;
    }
}