package algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 동전_0 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String coinAndMoney = br.readLine();

        String[] coinAndMoneyArray = coinAndMoney.split(" ");

        int coinAmount = Integer.parseInt(coinAndMoneyArray[0]);
        long money = Long.parseLong(coinAndMoneyArray[1]);

        long[] coinCategory = getCoincategory(coinAmount, br);

        long answer = solution(coinAmount, money, coinCategory);

        System.out.println(answer);
    }

    public static long[] getCoincategory(int coinAmount, BufferedReader br) throws IOException {
        long[] result = new long[coinAmount];
        for (int i = 0; i < coinAmount; i++) {

            result[i] = Integer.parseInt(br.readLine());
        }

        return result;
    }

    public static long solution(int n, long money, long[] array) {
        long answer = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (array[i] > money) {
                continue;
            }

            answer += (money / array[i]);
            money %= array[i];

            if (money == 0) {
                break;
            }
        }

        return answer;
    }
}
