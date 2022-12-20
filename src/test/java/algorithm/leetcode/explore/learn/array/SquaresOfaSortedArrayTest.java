package algorithm.leetcode.explore.learn.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquaresOfaSortedArrayTest {

    private final SquaresOfaSortedArray test = new SquaresOfaSortedArray();

    @Test
    void sortedSquares() {
        assertArrayEquals(new int[]{0,1,9,16,100}, test.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
        assertArrayEquals(new int[]{4,9,9,49,121}, test.sortedSquares(new int[]{-7,-3,2,3,11}));
        assertArrayEquals(new int[]{1,16,25,100000000,100000000}, test.sortedSquares(new int[]{-10000,1,4,5,10000}));
    }
}