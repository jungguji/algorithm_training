package algorithm.baekjoon.inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최댓값 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int max = 0;
            int index = 0;

            for (int i = 1; i <= 9; i++) {
                int currentValue = Integer.parseInt(br.readLine());

                if (max < currentValue) {
                    max = currentValue;
                    index = (i);
                }

            }

            System.out.println(max);
            System.out.println(index);
        }
    }
}
