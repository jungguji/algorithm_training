package algorithm.leetcode.problems.prefixsum.easy;

public class N1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int answer = 0;
        int[] psum = getPrefixSum(arr);

        int interval = 1;

        while (interval <= arr.length) {
            for (int i = 0; (interval + i) <= arr.length; i++) {
                answer += (psum[interval + i] - psum[i]);
            }

            interval += 2;
        }

        return answer;
    }

    private int[] getPrefixSum(int[] arr) {
        int[] psum = new int[arr.length+1];

        for (int i = 1; i <= arr.length; ++i) {
            psum[i] = psum[i-1] + arr[i-1];
        }

        return psum;
    }
}
