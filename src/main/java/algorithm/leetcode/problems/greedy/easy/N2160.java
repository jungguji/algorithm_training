package algorithm.leetcode.problems.greedy.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class N2160 {
    public int minimumSum(int num) {

        int[] array = getSortedArray(num);

        int x = (array[0] * 10) + array[2];
        int y = (array[1] * 10) + array[3];

        return x + y;
    }

    private int[] getSortedArray(int num) {
        int[] array = new int[4];
        int i = 0;
        while (num > 0) {
            array[i++] = num % 10;
            num /= 10;
        }

        Arrays.sort(array);

        return array;
    }
}
