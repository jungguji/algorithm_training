package algorithm.leetcode.problems.greedy.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class N1221Test {

    private final N1221 test = new N1221();

    @Test
    void balancedStringSplit() {
        assertEquals(4,this.test.balancedStringSplit("RLRRLLRLRL"));
        assertEquals(2,this.test.balancedStringSplit("RLRRRLLRLL"));
        assertEquals(1,this.test.balancedStringSplit("LLLLRRRR"));
        assertEquals(0,this.test.balancedStringSplit("LLLLLLLL"));
        assertEquals(0,this.test.balancedStringSplit("LLLLLLLR"));
        assertEquals(6,this.test.balancedStringSplit("LRLRLRLRLRRL"));
        assertEquals(2,this.test.balancedStringSplit("LLRRRLLLLRR"));
    }
}