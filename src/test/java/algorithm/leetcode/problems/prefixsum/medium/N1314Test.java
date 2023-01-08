package algorithm.leetcode.problems.prefixsum.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class N1314Test {

    @Test
    void matrixBlockSum() {
        N1314 test = new N1314();
        assertArrayEquals(new int[][] {{12,21,16},{27,45,33},{24,39,28}}, test.matrixBlockSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, 1));;
        assertArrayEquals(new int[][] {{45,45,45},{45,45,45},{45,45,45}}, test.matrixBlockSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, 2));;
    }
}