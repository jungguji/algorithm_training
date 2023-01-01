package algorithm.leetcode.problems.prefixsum.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class N1732Test {

    @Test
    void largestAltitude() {
        N1732 test = new N1732();
        assertEquals(1, test.largestAltitude(new int[] {-5,1,5,0,-7}));
        assertEquals(0,test.largestAltitude(new int[] {-4,-3,-2,-1,4,3,2}));
        assertEquals(1000,test.largestAltitude(new int[] {1000}));
    }
}