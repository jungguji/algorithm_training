package algorithm.baekjoon.bruteforce.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int amount = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (amount-- > 0) {
            int count = 0;
            int[] nm = convertStringArrayToIntegerArray(br.readLine().split(" "));

            for (int i = nm[0]; i <= nm[1]; i++) {
                char[] array = String.valueOf(i).toCharArray();
                for (char c : array) {
                    if (c == '0') {
                        ++count;
                    }
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
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
