package algorithm.baekjoon.inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 검증수 {
    public static void main(String[] args) throws IOException {
        String[] array = getInputData(System.in).split(" ");

        int sum = getSum(array);

        System.out.println(sum%10);

    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
        }
    }

    private static int getSum(String[] array) {
        int sum = 0;
        for (String str : array) {
            int value = Integer.parseInt(str);
            sum += (value * value);
        }

        return sum;
    }
}
