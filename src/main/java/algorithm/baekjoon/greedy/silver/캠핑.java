package algorithm.baekjoon.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 캠핑 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int i = 0;

        String input = "";
        while (!"0 0 0".equals(input = br.readLine())) {
            int[] lpv = convertStringArrayToIntegerArray(input.split(" "));

            int l = lpv[0];
            int p = lpv[1];
            int v = lpv[2];

            sb.append("Case ").append(++i).append(": ").append((v/p) * l + ((v%p) > l ? l : (v%p))).append("\n");
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
