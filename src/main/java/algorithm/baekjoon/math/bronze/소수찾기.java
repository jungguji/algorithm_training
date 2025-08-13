package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 소수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int count = 0;
        for (int element : array) {
            boolean 소수임 = true;
            for (int i = 2; i * i <= element; ++i) {
                if (element % i == 0) {
                    소수임 = false;
                    break;
                }
            }

            if (element != 1 && 소수임) {
                ++count;
            }
        }

        System.out.println(count);
    }
}
