package algorithm.baekjoon.string.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] xy = br.readLine().split(" ");

        char[] x = xy[1].toCharArray();
        char[] y = xy[0].toCharArray();

        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i <= x.length - y.length; i++) {
            int yIndex = 0;
            for (int j = i; j < y.length + i; j++) {
                if (x[j] != y[yIndex]) {
                    ++count;
                }
                yIndex++;
            }

            if (min > count) {
                min = count;
            }
            count = 0;
        }

        if (x.length == y.length) {
            for (int i = 0; i < x.length; i++) {
                if (x[i] != y[i]) {
                    ++count;
                }
            }
            min = count;
        }

        System.out.println(min);
    }
}
