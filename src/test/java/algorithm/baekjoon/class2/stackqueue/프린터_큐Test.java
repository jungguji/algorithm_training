package algorithm.baekjoon.class2.stackqueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 프린터_큐Test {

    private 프린터_큐 test;

    @BeforeEach
    void setUp() {
        test = new 프린터_큐();
    }

    @Test
    void solution() {
        assertEquals(1, test.solution(1, 0, new int[]{5}));
        assertEquals(2, test.solution(4, 2, new int[]{1, 2, 3, 4}));
        assertEquals(5, test.solution(6, 0, new int[]{1, 1, 9, 1, 1, 1}));
        assertEquals(1, test.solution(4, 2, new int[]{2, 1, 3, 2}));
        assertEquals(6, test.solution(6, 3, new int[]{2, 2, 2, 1, 3, 4}));
        assertEquals(2, test.solution(4, 3, new int[]{1, 2, 3, 2}));
    }
}