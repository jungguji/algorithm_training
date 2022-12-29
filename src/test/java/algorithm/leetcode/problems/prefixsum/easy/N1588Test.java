package algorithm.leetcode.problems.prefixsum.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class N1588Test {

    private final N1588 test = new N1588();

    @Test
    void sumOddLengthSubarrays() {
        assertEquals(58, this.test.sumOddLengthSubarrays(new int[] {1,4,2,5,3}));
        assertEquals(3, this.test.sumOddLengthSubarrays(new int[] {1,2}));
        assertEquals(66, this.test.sumOddLengthSubarrays(new int[] {10,11,12}));
        assertEquals(10, this.test.sumOddLengthSubarrays(new int[] {10}));
    }
}