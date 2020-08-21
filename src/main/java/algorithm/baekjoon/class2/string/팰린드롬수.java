package algorithm.baekjoon.class2.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬수 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String input = "";

            while (!((input = br.readLine()).equals("0"))) {
                int[] array = convertStringToIntegerArray(input);

                String answer = yesOrNo(array);

                System.out.println(answer);
            }
        }
    }

    private static int[] convertStringToIntegerArray(String args) {
        char[] charArray = args.toCharArray();
        int[] array = new int[charArray.length];
        int i = 0;
        for (char str : charArray) {
            array[i++] = Integer.parseInt(String.valueOf(str));
        }

        return array;
    }

    private static String yesOrNo(int[] array) {
        int head = 0;
        int tail = array.length - 1;
        String answer = "yes";

        while (tail >= head) {
            if (array[head] - array[tail] != 0) {
                answer = "no";
                break;
            }

            ++head;
            --tail;
        }

        return answer;
    }
}
