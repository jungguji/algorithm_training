package algorithm.baekjoon.bruteforce.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 방_배정하기 {
    private static int LIMIT = 50;

    public static void main(String[] args) throws IOException {
        int[] abcn = convertStringArrayToIntegerArray(getInputData(System.in).split(" "));

        int answer = 0;
        for (int i = 0; i <= LIMIT; i++) {
            for (int j = 0; j <= LIMIT; j++) {
                for (int k = 0; k <= LIMIT; k++) {
                    if ((i * abcn[0]) + (j * abcn[1]) + (k * abcn[2]) == abcn[3]) {
                        answer = 1;
                        break;
                    }
                }
            }
        }

        System.out.println(answer);
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
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
}
