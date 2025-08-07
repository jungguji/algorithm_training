package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 영수증 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        while (N-- > 0) {
            sum += Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .reduce(1, (a, b) -> a * b);
        }

        System.out.println(sum == X ? "Yes" : "No");
    }
}
