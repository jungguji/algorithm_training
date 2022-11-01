package algorithm.baekjoon.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 진수16 {
    public static void main(String[] args) throws IOException {
        String input = getInputData(System.in);

        System.out.println(Integer.parseInt(input, 16));
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            return br.readLine();
        }
    }
}
