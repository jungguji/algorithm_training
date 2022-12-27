package algorithm.leetcode.problems.prefixsum.easy;

public class N1480 {
    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];

        answer[0] = nums[0];

        for (int i = 1; i <= nums.length-1; i++) {
           answer[i] = answer[i-1] + nums[i];
        }

        return answer;
    }
}

/**
 * public int[] runningSum(int[] nums) {
 *
 *         for(int i = 1; i < nums.length; i++)
 *
 *         {
 *
 *             nums[i] = nums[i-1] + nums[i];
 *
 *         }
 *
 *         return nums;
 *
 *     }
 */
