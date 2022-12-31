package algorithm.leetcode.problems.prefixsum.easy;

public class N2485 {
    public int pivotInteger(int n) {
        int[] psum = getPrefixSum(n);

        return getAnswer(n, psum);
    }

    private int getAnswer(int n, int[] psum) {
        int answer = -1;

        for (int i = 1; i <= n; ++i) {
            if (psum[i] == (psum[n] - psum[i-1])) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    private int[] getPrefixSum(int n) {
        int[] psum = new int[n+1];

        for (int i = 1; i <= n; ++i) {
            psum[i] += psum[i-1] + i;
        }
        return psum;
    }
}
