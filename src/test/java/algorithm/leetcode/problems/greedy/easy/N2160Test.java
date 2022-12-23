package algorithm.leetcode.problems.greedy.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class N2160Test {

    private final N2160 test = new N2160();

    @Test
    void minimumSum() {
        assertEquals(52, test.minimumSum(2932));
        assertEquals(13, test.minimumSum(4009));
        assertEquals(198, test.minimumSum(9999));
        assertEquals(1, test.minimumSum(1000));
        assertEquals(2, test.minimumSum(1100));
    }
}