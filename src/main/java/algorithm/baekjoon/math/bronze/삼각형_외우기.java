package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 삼각형_외우기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = 3;
        int[] array = new int[input];
        int i = 0;
        while (input-- > 0) {
            int n = Integer.parseInt(br.readLine());
            array[i++] = n;
        }


        if (
                array[0] == 60
                        && array[1] == 60
                        && array[2] == 60
        ) {
            System.out.println("Equilateral");
            return;
        }

        int i1 = array[0] + array[1] + array[2];


        if (i1 != 180) {
            System.out.println("Error");
            return;
        }

        if (
                array[0] == array[1] || array[0] == array[2] || array[1] == array[2]
        ) {
            System.out.println("Isosceles");
            return;
        }

        System.out.println("Scalene");
    }
}
