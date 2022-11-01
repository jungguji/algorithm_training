package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 소수_만들기Test {

    private 소수_만들기 test;

    @BeforeEach
    void setUp() {
        test = new 소수_만들기();
    }

    @Test
    void solution() {
        assertEquals(1, test.solution(new int[]{1, 2, 3, 4}));
        assertEquals(4, test.solution(new int[]{1, 2, 7, 6, 4}));
    }
}