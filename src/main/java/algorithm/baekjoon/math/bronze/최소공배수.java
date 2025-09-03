package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int[] AB = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int A = AB[0];
            int B = AB[1];

            int gcd = gcd(A, B);

            int lcm = (A * B) / gcd;
            sb.append(lcm).append("\n");
        }

        System.out.println(sb);
    }

    private static int gcd(int a, int b) {
        int temp = 0;

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
