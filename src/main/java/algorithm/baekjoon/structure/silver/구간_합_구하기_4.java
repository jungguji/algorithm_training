package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 구간_합_구하기_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = convertStringArrayToIntegerArray(br.readLine().split(" "));

        int[] array = convertStringArrayToIntegerArray(br.readLine().split(" "));

        int[] preSum = new int[nm[0]+1];

        for (int i = 1; i <= array.length; i++) {
            preSum[i] = preSum[i-1] + array[i-1];
        }

        StringBuilder sb = new StringBuilder();
        while (nm[1]-- > 0) {
            int[] ij = convertStringArrayToIntegerArray(br.readLine().split(" "));

            sb.append(preSum[ij[1]] - preSum[ij[0] - 1]).append("\n");
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
