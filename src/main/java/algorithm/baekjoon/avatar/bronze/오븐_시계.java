package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 오븐_시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] AB = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int C = Integer.parseInt(br.readLine());

        int minutes = (AB[0] * 60) + AB[1];
        int sum = minutes + C;

        int hour = (sum / 60) % 24;
        int minute = sum % 60;

        System.out.println(hour + " " + minute);
    }
}
