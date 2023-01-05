package algorithm.leetcode.problems.prefixsum.medium;

public class N2391 {

    private final static char[] GARBAGES = new char[]{'M','P','G'};

    public int garbageCollection(String[] garbage, int[] travel) {
        int[] psum = getPrefixSum(travel);

        int answer = 0;

        for (char g : GARBAGES) {

            int position = 0;
            for (int i = 0; i < garbage.length; ++i) {
                int count = 0;
                char[] chars = garbage[i].toCharArray();

                for (char ch : chars) {
                    if (ch == g) {
                        ++count;
                        position = i;
                    }
                }

                answer += count;
            }

            answer += psum[position];
        }

        return answer;
    }

    private int[] getPrefixSum(int[] travel) {
        int[] psum = new int[travel.length + 1];

        for (int i = 1; i <= travel.length; ++i) {
            psum[i] += psum[i-1] + travel[i-1];
        }

        return psum;
    }

}
