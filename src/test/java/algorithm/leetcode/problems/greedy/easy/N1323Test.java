package algorithm.leetcode.problems.greedy.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class N1323Test {

    private final N1323 test = new N1323();

    @Test
    void maximum69Number() {
        assertEquals(9969,test.maximum69Number(9669));
        assertEquals(9999,test.maximum69Number(9996));
        assertEquals(9999,test.maximum69Number(9999));
        assertEquals(9,test.maximum69Number(6));
        assertEquals(9,test.maximum69Number(9));
        assertEquals(99,test.maximum69Number(69));
    }
}