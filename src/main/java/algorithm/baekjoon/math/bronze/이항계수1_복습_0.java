package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 이항계수1_복습_0 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = array[0];
        int r = array[1];

        // 10개 중에서 6개 구하는거랑
        // 10개 중에서 안필요한 4개 구하는거랑 똑같으므로
        // n의 절반보다 r이 크면
        // n-r로 바꿈
        if (r > n / 2) {
            r = n - r;
        }

        int sum = 1;
        for (int i = 1; i <= r; ++i) {
            sum = sum * (n - i + 1) / i;
        }

        System.out.println(sum);
    }
}
