package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 약수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] KN = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int answer = 0;
        int i = 1;
        int count = 0;
        while (KN[0] >= i) {
            if (KN[0] % i == 0) {
                ++count;
            }

            if (count == KN[1]) {
                answer = i;
                break;
            }

            ++i;
        }

        System.out.println(answer);
    }
}
