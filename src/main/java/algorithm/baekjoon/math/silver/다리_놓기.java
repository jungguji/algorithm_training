package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 다리_놓기 {

    private static BigInteger[] memory;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        while (count-- != 0) {
            int[] nm = convertStringArrayToIntegerArray(br.readLine().split(" "));
            memory = new BigInteger[nm[1] + 1];
            memory[0] = BigInteger.valueOf(1L);
            memory[1] = BigInteger.valueOf(1L);

            System.out.println(nCr(nm[1], nm[0]));
        }
    }

    private static BigInteger nCr(int n, int r) {
        return (f(n).divide((f(n-r).multiply(f(r)))));
    }

    private static BigInteger f(int n) {
        if (memory[n] != null) {
            return memory[n];
        }

        memory[n] = BigInteger.valueOf(n).multiply(f(n-1));

        return memory[n];
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }
}
