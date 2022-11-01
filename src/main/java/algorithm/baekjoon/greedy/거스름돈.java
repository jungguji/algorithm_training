package algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 거스름돈 {

    private final static int MONEY = 1000;
    private final static int[] ARRAY = new int[]{500, 100, 50, 10, 5, 1};

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int answer = getChangesAmount(input);

        System.out.println(answer);
    }

    public static int getChangesAmount(int args) {
        int answer = 0;
        int changes = MONEY - args;

        int i = 0;
        while (changes != 0) {
            answer += (changes / ARRAY[i]);
            changes %= ARRAY[i++];
        }

        return answer;
    }
}
