package algorithm.leetcode.problems.prefixsum.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class N2485Test {

    @Test
    void pivotInteger() {
        N2485 test = new N2485();

        assertEquals(6,test.pivotInteger(8));
        assertEquals(1,test.pivotInteger(1));
        assertEquals(-1,test.pivotInteger(4));
        assertEquals(-1,test.pivotInteger(2));
    }
}