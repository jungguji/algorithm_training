package algorithm.leetcode.problems.prefixsum.easy;

public class N1829 {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] psum = getPrefixSum(nums);

        int[] answer = new int[nums.length];

        int answerIndex = 0;
        int maxValue = (1 << maximumBit) - 1;

        for (int i = psum.length-1; i > 0; --i) {

            answer[answerIndex++] = psum[i] ^ maxValue;
        }

        return answer;
    }

    private int[] getPrefixSum(int[] nums) {
        int[] psum = new int[nums.length + 1];

        for (int i = 1; i <= nums.length; ++i) {
            psum[i] = psum[i-1] ^ nums[i-1];
        }
        return psum;
    }
}
