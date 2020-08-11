package algorithm.baekjoon.inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 아스키_코드 {
    public static void main(String[] args) throws IOException {
        char[] array = getInputData(System.in).toCharArray();
        System.out.println((int) array[0]);

    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
        }
    }
}
