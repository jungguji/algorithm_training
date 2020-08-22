package algorithm.baekjoon.fourrulescalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 엄청난부자2 {
    public static void main(String[] args) throws IOException {
        String[] input = getInputData(System.in).split(" ");
        BigInteger[] nm = convertStringArrayToIntegerArray(input);

        System.out.println(nm[0].divide(nm[1]));
        System.out.println(nm[0].mod(nm[1]));
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
        }
    }

    private static BigInteger[] convertStringArrayToIntegerArray(String[] args) {
        BigInteger[] array = new BigInteger[args.length];
        int i = 0;

        for (String str : args) {
            array[i++] = new BigInteger(str);
        }

        return array;
    }
}
