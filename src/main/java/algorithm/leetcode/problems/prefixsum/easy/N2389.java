package algorithm.leetcode.problems.prefixsum.easy;

import java.util.Arrays;

public class N2389 {

    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int[] prefixSum = getPrefixSum(nums);

        int[] answer = getAnswer(queries, prefixSum);

        return answer;
    }

    private int[] getPrefixSum(int[] nums) {
        int[] psum = new int[nums.length + 1];

        for (int i = 1; i <= nums.length; ++i) {
            psum[i] = psum[i - 1] + nums[i - 1];
        }

        return psum;
    }

    private int[] getAnswer(int[] queries, int[] prefixSum) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; ++i) {
            for (int j = 1; j < prefixSum.length; ++j) {

                if (prefixSum[j] <= queries[i]) {
                    answer[i] = j;
                } else {
                    break;
                }
            }
        }
        return answer;
    }
}
