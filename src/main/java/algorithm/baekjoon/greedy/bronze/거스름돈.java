package algorithm.baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 거스름돈 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            int 짤 = 1000 - n;
            int answer = 0;
            answer += (짤 / 500);
            짤 %= 500;
            answer += (짤 / 100);
            짤 %= 100;
            answer += (짤 / 50);
            짤 %= 50;
            answer += (짤 / 10);
            짤 %= 10;
            answer += (짤 / 5);
            짤 %= 5;
            answer += (짤 / 1);

            System.out.println(answer);
        }
    }
}
