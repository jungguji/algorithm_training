package algorithm.baekjoon.inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최소_최대 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            br.readLine();

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            String[] array = br.readLine().split(" ");

            for (String str : array) {
                int number = Integer.parseInt(str);

                max = max < number ? number : max;
                min = min > number ? number : min;
            }

            System.out.println(min + " " + max);
        }
    }
}
