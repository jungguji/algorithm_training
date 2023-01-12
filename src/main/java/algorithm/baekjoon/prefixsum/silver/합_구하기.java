package algorithm.baekjoon.prefixsum.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 합_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());
        int[] array = convertStringArrayToIntegerArray(br.readLine().split(" "));
        int[] psum = getPrefixSum(array);

        int m = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {
            int[] ij = convertStringArrayToIntegerArray(br.readLine().split(" "));

            sb.append(psum[ij[1]]-psum[ij[0]-1]).append("\n");
        }

        System.out.println(sb);
    }

    private static int[] getPrefixSum(int[] array) {
        int[] psum = new int[array.length+1];

        for (int n = 1; n <= array.length; n++) {
            psum[n] = psum[n-1] + array[n-1];
        }

        return psum;
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
