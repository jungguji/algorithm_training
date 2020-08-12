package algorithm.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 상수 {
    public static void main(String[] args) throws IOException {
        String[] array = getInputData(System.in).split(" ");

        int a1 = Integer.parseInt(new StringBuilder(array[0]).reverse().toString());
        int a2 = Integer.parseInt(new StringBuilder(array[1]).reverse().toString());

        System.out.println(a1 > a2 ? a1 : a2);
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
        }
    }
}
