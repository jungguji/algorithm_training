package algorithm.baekjoon.inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 두_수_비교하기 {
    public static void main(String[] args) throws IOException {
        String[] array = getInputData(System.in).split(" ");

        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        System.out.println(a > b ? ">" : a < b ? "<" : "==");
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
        }
    }
}
