package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 분수합_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] A = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] B = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 1. 분모 최소 공배수로 통분
        int A분모 = A[1];
        int B분모 = B[1];
        int gcd = gcd(A분모, B분모);
        int 통분한_분모 = (A분모 * B분모) / gcd;

        // 2. 분모 통분됐으니까 분자들도 분모 통분될때 곱한 값들 곱함
        int A분자 = A[0];
        int B분자 = B[0];

        int 더해진_분자 = 분자계산(A분자, A분모, 통분한_분모) + 분자계산(B분자, B분모, 통분한_분모);

        // 3. 기약분수 만들기
        int gcd1 = gcd(더해진_분자, 통분한_분모);

        System.out.println((더해진_분자 / gcd1) + " " + (통분한_분모 / gcd1));
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    private static int 분자계산(int 분자, int 분모, int 통분된_분모) {
        // 통분된 분모가 분모에 뭘 곱해서 통분된 분모가 됐는지 알려면
        // 통분도니 분모를 기존 분모로 나누면 되니까
        return 분자 * (통분된_분모 / 분모);
    }
}
