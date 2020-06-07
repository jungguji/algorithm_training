package algorithm.baekjoon.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 로프Test {

    private 로프 test;

    @BeforeEach
    public void setUp() {
        test = new 로프();
    }

    @Test
    public void testSolution() {
        assertEquals(1, test.getMaxWeight(new int[] {1}));
        assertEquals(2, test.getMaxWeight(new int[] {1, 1}));
        assertEquals(20, test.getMaxWeight(new int[] {10, 15}));
        assertEquals(20, test.getMaxWeight(new int[] {15, 10}));
        assertEquals(100, test.getMaxWeight(new int[] {100}));
        assertEquals(12, test.getMaxWeight(new int[] {11,5,4}));
        assertEquals(100, test.getMaxWeight(new int[] {1,7,100}));
        assertEquals(800, test.getMaxWeight(new int[] {5, 15, 20, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 100, 100}));
    }
}