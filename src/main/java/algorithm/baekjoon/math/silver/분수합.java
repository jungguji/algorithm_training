package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 분수합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] AB1 = Arrays.stream(br.readLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        long[] AB2 = Arrays.stream(br.readLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();

        long A1 = AB1[0];
        long A2 = AB2[0];

        long B1 = AB1[1];
        long B2 = AB2[1];


        long gcd = gcd(B1, B2);
        // 공통분모가 됨
        long lcm = (B1*B2) / gcd;

        long 더한분자 = 분자계산(A1, B1, lcm) + 분자계산(A2, B2, lcm);

        // 기약분수 만들기
        long gcd1 = gcd(더한분자, lcm);

        System.out.println(더한분자 / gcd1 + " " + (lcm / gcd1));
    }

    private static long gcd(long a, long b) {
        while (b > 0) {
            long r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    private static long 분자계산(long 분자, long 분모, long 새로구한_공통분모) {
        // 새로구한 분모가 되기위해 분모에 곱했던 값을 분자에 똑같이 곱함
        return 분자 * (새로구한_공통분모 / 분모);
    }
}
