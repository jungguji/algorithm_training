package algorithm.leetcode.problems.prefixsum.easy;

public class N1732 {
    public int largestAltitude(int[] gain) {
        int[] psum = getPrefixSum(gain);

        return getHighestAltitude(psum);
    }

    private int getHighestAltitude(int[] psum) {
        int max = 0;
        for (int i : psum) {
            max = Math.max(max, i);
        }
        return max;
    }

    private int[] getPrefixSum(int[] gain) {
        int[] psum = new int[(gain.length + 1)];

        for (int i = 1; i <= gain.length; ++i) {
            psum[i] = psum[i - 1] + gain[i-1];
        }
        return psum;
    }
}
