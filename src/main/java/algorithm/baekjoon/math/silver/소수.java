package algorithm.baekjoon.math.silver;

import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;

public class 소수 {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {

            double[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            BigDecimal bigDecimal = BigDecimal.valueOf(array[0]);
            BigDecimal bigDecimal1 = BigDecimal.valueOf(array[1]);
            BigDecimal divide = bigDecimal.divide(bigDecimal1, MathContext.DECIMAL128);

            if (divide.scale() <= 0) {
                bw.write("0");
            } else {
                String string = divide.toString();
                String[] split = string.split("\\.");
                bw.write(split[1].charAt((int) array[2] - 1));
            }
            bw.flush();
        }
    }
}
