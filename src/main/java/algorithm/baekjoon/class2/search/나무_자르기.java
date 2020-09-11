package algorithm.baekjoon.class2.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 나무_자르기 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long[] nm = convertStringArrayToLongArray(br.readLine().split(" "));

            long m = nm[1];

            long[] trees = convertStringArrayToLongArray(br.readLine().split(" "));

            long answer = solution(trees, m);

            System.out.println(answer);
        }
    }

    private static long[] convertStringArrayToLongArray(String[] args) {
        long[] array = new long[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }

    public static long solution(long[] trees, long m) {
        Arrays.sort(trees);

        long low = 0;
        long high = trees[trees.length - 1];

        long answer = 0;

        while (low <= high) {
            long mid = (low + high) >>> 1;
            long sum = getTrees(trees, mid);

            if (sum < m) {
                high = mid - 1;
            } else {
                answer = Math.max(answer, mid);
                low = mid + 1;
            }
        }

        return answer;
    }

    private static long getTrees(long[] trees, long mid) {
        long sum = 0;
        for (int i = 0; i < trees.length; i++) {
            sum += trees[i] > mid ? trees[i] - mid : 0;
        }

        return sum;
    }
}
