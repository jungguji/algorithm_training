package algorithm.leetcode.problems.prefixsum.medium;

public class N1314 {

    /**
     * 일단 커서를 이동 시켜야하고,
     * 이동한 커서의 위치에서 k를 빼고 더해야하는데,
     * prefix sum 으로 x에 대한 값들은 미리 다 구해놨음
     *
     * 현재 x,y 위치 받아서,
     * y 만큼 돌고
     * x 만큼 도는데
     * x는 + k만큼씩 증가해야하고,
     * y는 1씩 증가하면서 +k까지 증가하면 됨.
     *
     *
     * @param mat
     * @param k
     * @return
     */
    public int[][] matrixBlockSum(int[][] mat, int k) {

        int x = mat[0].length;
        int y = mat.length;

        int[][] answer = new int[y][x];

        int[][] prefixSum = getPrefixSum(mat, x, y);

        for (int i = 0; i < y; ++i) {
            for (int j = 0; j < x; ++j) {
                answer[i][j] = test(j, x, i, y-1, k, prefixSum);
            }
        }

        return answer;
    }

    private int[][] getPrefixSum(int[][] mat, int x, int y) {
        int[][] prefixSum = new int[y][x+1];

        for (int i = 0; i < y; ++i) {
            for (int j = 1; j <= x; ++j) {
                prefixSum[i][j] = prefixSum[i][j-1] + mat[i][j-1];
            }
        }

        return prefixSum;
    }

    private int test(int xCursor, int x, int yCursor, int y, int k, int[][] mat) {
        y = getY(yCursor, y, k);
        yCursor = getyCursor(yCursor, k);

        int sum = 0;
        for (int r = yCursor; r <= y; ++r) {
            int xStartIndex = getxStartIndex(xCursor, k);
            int c = getC(xCursor, x, k);

            sum += mat[r][c] - mat[r][xStartIndex];
        }

        return sum;
    }

    private int getY(int yCursor, int y, int k) {
        if (yCursor+k < y) {
            y = yCursor+k;
        }
        return y;
    }

    private int getyCursor(int yCursor, int k) {
        if (yCursor-k < 0) {
            yCursor = 0;
        } else {
            yCursor = yCursor-k;
        }
        return yCursor;
    }

    private int getxStartIndex(int xCursor, int k) {
        int xStartIndex = xCursor-k;

        if (xStartIndex < 0) {
            xStartIndex = 0;
        }
        return xStartIndex;
    }

    private int getC(int xCursor, int x, int k) {
        int c = (xCursor + k)+1;
        if (c > x) {
            c = x;
        }
        return c;
    }
}
