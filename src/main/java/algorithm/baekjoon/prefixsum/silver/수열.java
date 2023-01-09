package algorithm.baekjoon.prefixsum.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nk = convertStringArrayToIntegerArray(br.readLine().split(" "));
        int k = nk[1];

        int[] array = convertStringArrayToIntegerArray(br.readLine().split(" "));

        int max = solution(k, array);

        System.out.println(max);
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }

    public static int solution(int k, int[] array) {
        int[] prefixSum = getPrefixSum(array);

        int max = Integer.MIN_VALUE;
        for (int i = k; i < prefixSum.length; ++i) {
            max = Math.max(max, prefixSum[i] - prefixSum[i-k]);
        }
        return max;
    }

    private static int[] getPrefixSum(int[] array) {
        int[] psum = new int[array.length+1];

        for (int i = 1; i <= array.length; ++i) {
            psum[i] = psum[i-1] + array[i-1];
        }

        return psum;
    }
}
