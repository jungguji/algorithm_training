package algorithm.baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APC는_왜_서브태스크_대회가_되었을까 {
    private static final int HUNDRED = 100;
    private static final int HUNDRED_FORTY = 140;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nlk = convertStringArrayToIntegerArray(br.readLine().split(" "));

        int n = nlk[0];
        int l = nlk[1];
        int k = nlk[2];

        int answer = 0;
        while (n-- > 0) {
            int[] subs = convertStringArrayToIntegerArray(br.readLine().split(" "));

            if (subs[1] <= l) {
                answer += HUNDRED_FORTY;
            } else if (subs[0] <= l) {
                answer += HUNDRED;
            }
        }

        System.out.println(answer);
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
