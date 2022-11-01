package algorithm.leetcode.explore.learn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {

    private MaxConsecutiveOnes test;

    @BeforeEach
    public void setup() {
        test = new MaxConsecutiveOnes();
    }


    @Test
    void findMaxConsecutiveOnes() {
        assertEquals(3, test.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
        assertEquals(2, test.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
        assertEquals(1, test.findMaxConsecutiveOnes(new int[]{1, 0, 1, 0, 1, 0}));
        assertEquals(2, test.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1}));
        assertEquals(0, test.findMaxConsecutiveOnes(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0}));
        assertEquals(1, test.findMaxConsecutiveOnes(new int[]{1, 0, 0, 0, 0, 1}));
        assertEquals(1, test.findMaxConsecutiveOnes(new int[]{1}));
        assertEquals(0, test.findMaxConsecutiveOnes(new int[]{0}));

    }
}