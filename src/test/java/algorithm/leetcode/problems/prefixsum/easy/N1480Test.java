package algorithm.leetcode.problems.prefixsum.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class N1480Test {

    private final N1480 test = new N1480();

    @Test
    void runningSum() {
        assertArrayEquals(new int[]{1,3,6,10}, test.runningSum(new int[]{1,2,3,4}));
        assertArrayEquals(new int[]{1,2,3,4,5}, test.runningSum(new int[]{1,1,1,1,1}));
        assertArrayEquals(new int[]{3,4,6,16,17}, test.runningSum(new int[]{3,1,2,10,1}));
    }
}