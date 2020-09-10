package algorithm.baekjoon.class2.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 나무_자르기 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nm = convertStringArrayToIntegerArray(br.readLine().split(" "));

            int n = nm[0];
            int m = nm[1];

            int[] trees = convertStringArrayToIntegerArray(br.readLine().split(" "));

            Arrays.sort(trees);

            int answer = cutHeight(trees,0 , trees.length, m);

            System.out.println(answer);;
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

    private static int cutHeight(int[] array, int fromIndex, int toIndex, int m) {
        int low = fromIndex;
        int high = toIndex - 1;

        int mid = 0;
        while (low <= high) {
            mid = (low + high) >>> 1;

            int sum = 0;
            for (int i = mid; i <= high; i++) {
                sum += (array[i] - array[mid]);
            }

            if (sum < m) {
                low = mid + 1;
            } else if (sum > m) {
                high = mid - 1;
            } else {
                break;
            }
        }

        return array[mid];
    }
}
