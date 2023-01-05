package algorithm.leetcode.problems.prefixsum.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class N2389Test {

    @Test
    void answerQueries() {
        N2389 test = new N2389();
        assertArrayEquals(new int[] {2,3,4}, test.answerQueries(new int[] {4,5,2,1}, new int[] {3,10,21}));
        assertArrayEquals(new int[] {3,4,2}, test.answerQueries(new int[] {4,5,2,1}, new int[] {10,21,3}));
        assertArrayEquals(new int[] {0}, test.answerQueries(new int[] {2,3,4,5}, new int[] {1}));
    }
}