package algorithm.baekjoon.greedy.silver;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 뒤집기Test {

    private 뒤집기 test;

    @BeforeEach
    void setUp() {
        test = new 뒤집기();
    }

    @Test
    void solution() {
        assertEquals(3, test.solution("01001001"));
        assertEquals(2, test.solution("1001001"));
        assertEquals(1, test.solution("1110"));
        assertEquals(1, test.solution("0001100"));
        assertEquals(3, test.solution("100010101"));
        assertEquals(4, test.solution("1010101011"));
        assertEquals(0, test.solution("1111111111111111111111111111111111111111111111111111111111"));
        assertEquals(4, test.solution("1111111111111110111111111101111111110001011111111111111111"));
    }
}