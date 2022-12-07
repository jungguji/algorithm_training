package algorithm.leetcode.explore.learn.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenNumberOfDigitsTest {

    private final EvenNumberOfDigits test = new EvenNumberOfDigits();

    @Test
    void findNumbers() {
        assertEquals(2, this.test.findNumbers(new int[] {12,345,2,6,7896}));
        assertEquals(1, this.test.findNumbers(new int[] {555,901,482,1771}));
        assertEquals(1, this.test.findNumbers(new int[] {100000}));
        assertEquals(0, this.test.findNumbers(new int[] {1}));
    }
}