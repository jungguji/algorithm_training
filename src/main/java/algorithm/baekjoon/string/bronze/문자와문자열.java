package algorithm.baekjoon.string.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자와문자열 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char[] charArray = br.readLine().toCharArray();
            int i = Integer.parseInt(br.readLine());

            System.out.println(charArray[i-1]);
        }
    }
}
