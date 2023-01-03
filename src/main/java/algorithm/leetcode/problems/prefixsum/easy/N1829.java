package algorithm.leetcode.problems.prefixsum.easy;

public class N1829 {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        final int limitK = (int) Math.pow(2, maximumBit);

        int[] psum = getPrefixSum(nums);

        int[] answer = new int[nums.length];

        int answerIndex = 0;
        for (int i = psum.length-1; i > 0; --i) {
            int max = 0;
            int k = 0;

            for (int j = 0; j < limitK; ++j) {
                if (max < (psum[i] ^ j)) {
                    max = (psum[i] ^ j);
                    k = j;
                }
            }

            answer[answerIndex++] = k;
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
