package algorithm.baekjoon.inoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 곱셈 {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ) {
            int first = Integer.parseInt(br.readLine());
            int second = Integer.parseInt(br.readLine());

            int result = first * second;
            while (second > 0) {
                int mod = second % 10;
                second /= 10;

                System.out.println(first * mod);
            }

            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
