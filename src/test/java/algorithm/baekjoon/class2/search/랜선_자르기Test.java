package algorithm.baekjoon.class2.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 랜선_자르기Test {

    private 랜선_자르기 test;

    @BeforeEach
    void setUp() {
        test = new 랜선_자르기();
    }

    @Test
    void solution() {
        assertEquals(200, test.solution(11, new int[]{802, 743, 457, 539}));
        assertEquals(266, test.solution(6, new int[]{800, 800, 400}));
        assertEquals(1, test.solution(4, new int[]{2, 1, 2, 1}));
        assertEquals(10, test.solution(6, new int[]{40, 20, 1}));
        assertEquals(100, test.solution(4, new int[]{200, 200, 200}));
        assertEquals(1, test.solution(1, new int[]{1}));
        assertEquals(2147483647, test.solution(1, new int[]{2147483647}));
    }
}