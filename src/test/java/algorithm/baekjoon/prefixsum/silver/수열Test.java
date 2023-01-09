package algorithm.baekjoon.prefixsum.silver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class 수열Test {

    @Test
    void solution() {
        수열 test = new 수열();
        assertEquals(21, 수열.solution(2, new int[]{3,-2,-4,-9,0,3,7,13,8,-3}));
        assertEquals(31, 수열.solution(5, new int[]{3,-2,-4,-9,0,3,7,13,8,-3}));
        assertEquals(1, 수열.solution(1, new int[]{1,1}));
        assertEquals(2, 수열.solution(2, new int[]{1,1,1}));
        assertEquals(-2, 수열.solution(2, new int[]{-1,-1}));
    }
}