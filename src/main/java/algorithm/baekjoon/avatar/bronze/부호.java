package algorithm.baekjoon.avatar.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 부호 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int testSet = 3;

            StringBuilder sb = new StringBuilder();
            while (testSet-- > 0) {
                int N = Integer.parseInt(br.readLine());

                BigInteger sum = BigInteger.ZERO;
                while (N-- > 0) {
                    sum = sum.add(new BigInteger(br.readLine()));
                }

                int compare = BigInteger.ZERO.compareTo(sum);
                if (compare == 0) {
                    sb.append("0").append("\n");
                } else if (compare > 0) {
                    sb.append("-").append("\n");
                } else {
                    sb.append("+").append("\n");
                }
            }
            System.out.println(sb);
        }
    }
}
