package algorithm.baekjoon.class2.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수_찾기 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            int[] numbers = convertStringArrayToIntegerArray(br.readLine().split(" "));

            int answer = getPrimeCount(numbers);

            System.out.println(answer);
        }
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }

    public static int getPrimeCount(int[] numbers) {
        int answer = 0;

        for (int e : numbers) {

            boolean prime = false;
            for (int i = 2; i * i <= e; i++) {
                if (e % i == 0) {
                    prime = true;
                    break;
                }
            }

            if (!prime && e != 1) {
                ++answer;
            }
        }

        return answer;
    }
}
