package algorithm.baekjoon.bruteforce.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영화감독_슘 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int number = 665;
        while (count < N) {
            ++number;

            if (String.valueOf(number).contains("666")) {
                ++count;
            }
        }

        System.out.println(number);
    }
}