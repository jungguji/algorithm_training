package algorithm.baekjoon.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사분면_고르기 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());

            int answer = 2;
            if (x > 0 && y > 0) {
                answer = 1;
            } else if (x > 0 && y < 0) {
                answer = 4;
            } else if (x < 0 && y < 0) {
                answer = 3;
            }

            System.out.println(answer);
        }
    }
}
