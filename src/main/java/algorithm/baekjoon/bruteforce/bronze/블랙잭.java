package algorithm.baekjoon.bruteforce.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 블랙잭 {
    private static int max = 0;
    private static int[] cards;
    private static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        M = nm[1];

        cards = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < cards.length; ++i) {
            dfs(i, 0, 0);
        }

        System.out.println(max);
    }

    private static void dfs(int index, int depth, int sum) {
        if (depth == 3) {
            if (max < sum) {
                max = sum;
            }

            return;
        }

        for (int i = index; i < cards.length; ++i) {
            if (sum + cards[i] > M) {
                continue;
            }

            sum += cards[i];
            dfs(i+1, depth+1, sum);
            sum -= cards[i];
        }
    }
}
