package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 달팽이는_올라가고_싶다_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ABV = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int A = ABV[0];
        int B = ABV[1];
        int V = ABV[2];

        double 마지막전날 = Math.ceil((double) (V - A) / (A - B));
        System.out.println((int) (마지막전날+1));
    }
}
