package algorithm.leetcode.explore.learn;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (1 == nums[i]) {
                ++current;
            } else {
                current = 0;
            }

            max = Math.max(max, current);
        }

        return max;
    }
}
