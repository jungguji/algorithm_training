package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 피보나치_수Test {

    private 피보나치_수 test;

    @BeforeEach
    void setUp() {
        test = new 피보나치_수();
    }

    @Test
    void solution() {
        assertEquals(2, test.solution(3));
        assertEquals(5, test.solution(5));
        assertEquals(987, test.solution(16));
        assertEquals(256379, test.solution(1234156));
        assertEquals(473509, test.solution(100001));
        assertEquals(1168141, test.solution(100000));
        assertEquals(547662, test.solution(124126347));
    }
}