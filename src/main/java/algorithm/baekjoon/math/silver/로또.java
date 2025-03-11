package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class 로또 {

    public static final int LOTTO_LENGTH = 6;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = br.readLine()).equals("0")) {
            int[] ks = convertStringArrayToIntegerArray(input.split(" "));
            recursive(0, Arrays.copyOfRange(ks, 1,ks.length), new Stack<>(), 0);

            System.out.println();
        }

    }

    private static void recursive(int index, int[] S, Stack<Integer> output, int depth) {
        if (depth == LOTTO_LENGTH) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < output.size(); i++) {
                sb.append(output.get(i)).append(" ");
            }

            System.out.print(sb);
            System.out.println();
            return;
        }

        for (int i = index; i < S.length; i++) {
            output.push(S[i]);
            recursive(i+1, S, output,depth+1);
            output.pop();
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
