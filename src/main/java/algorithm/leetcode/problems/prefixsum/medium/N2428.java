package algorithm.leetcode.problems.prefixsum.medium;

public class N2428 {

    /**
     * 행마다 psum우선 구해놓고 저장하고
     * 현재 좌표(i,j)를 받고,
     * 첫번쨰줄 = psum[i] - psum[i-3]
     * 두번쨰줄 = spum[i-1] - psum[i-2]
     * 셋째쭐 = 첫째랑 동
     * 하는데~
     * 좌표 j++ 해서 증가하면서 위 로직 계속 돌리면서
     * max값 변경하고
     * length 까지 가면 ~
     * 마찬가지로, 좌표 i++ 해서 증가하면서 위 로직 계쏙 돌림
     *
     *
     * @param grid
     * @return
     */
    public int maxSum(int[][] grid) {
        final int m = grid.length;
        final int n = grid[0].length;
        final int k = 3;

        int[][] psum = getPrefixSum(grid, m, n);

        return 0;
    }

    private int[][] getPrefixSum(int[][] grid, int m, int n) {
        int[][] psum = new int[m][n+1];

        for (int i = 0; i < m; ++i) {
            for (int j = 1; j <= n; ++j) {
                psum[i][j] = psum[i][j-1] + grid[i][j-1];
            }
        }

        return psum;
    }
}
