package algorithm.leetcode.problems.prefixsum.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class N2391Test {

    @Test
    void garbageCollection() {
        N2391 test = new N2391();

        assertEquals(21, test.garbageCollection(new String[] {"G","P","GP","GG"}, new int[] {2,4,3}));
        assertEquals(37, test.garbageCollection(new String[] {"MMM","PGM","GP"}, new int[] {3,10}));
        assertEquals(10, test.garbageCollection(new String[] {"MMMMMMMMMM"}, new int[] {}));
    }
}