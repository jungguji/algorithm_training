package algorithm.baekjoon.class3.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 팩토리얼_0의_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }

    public static int solution(String input) {
        BigInteger p = p(new BigInteger(input));

        char[] array = p.toString().toCharArray();

        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != '0') {
                break;
            }

            ++count;
        }

        return count;
    }

    public static BigInteger p(BigInteger n) {
        if (n.compareTo(new BigInteger("2")) == -1) {
            return new BigInteger("1");
        }

        return n.multiply(p(n.subtract(new BigInteger("1"))));
    }
}
