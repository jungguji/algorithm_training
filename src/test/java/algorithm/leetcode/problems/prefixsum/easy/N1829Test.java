package algorithm.leetcode.problems.prefixsum.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class N1829Test {

    @Test
    void getMaximumXor() {
        N1829 test = new N1829();

        assertArrayEquals(new int[] {0,3,2,3}, test.getMaximumXor(new int[] {0,1,1,3}, 2));
        assertArrayEquals(new int[] {5,2,6,5}, test.getMaximumXor(new int[] {2,3,4,7}, 3));
        assertArrayEquals(new int[] {4,3,6,4,6,7}, test.getMaximumXor(new int[] {0,1,2,2,5,7}, 3));
    }

    @Test
    void test() {
        int maxBit = 2;
        int target = (1 << maxBit) - 1;

        System.out.println("target = " + target);
    }
}