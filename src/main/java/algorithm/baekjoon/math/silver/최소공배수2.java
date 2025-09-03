package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 최소공배수2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] AB = Arrays.stream(br.readLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();

        long A = Math.max(AB[0], AB[1]);
        long B = Math.min(AB[1], AB[0]);

        System.out.println((A*B) / gcd(A,B));
    }

    private static long gcd(long a, long b) {
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }
}
