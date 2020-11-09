package algorithm.baekjoon.class3.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 팩토리얼_0의_개수Test {

    private 팩토리얼_0의_개수 test;

    @BeforeEach
    void setUp() {
        test = new 팩토리얼_0의_개수();
    }

    @Test
    void solution() {
        assertEquals(2, test.solution("10"));
        assertEquals(0, test.solution("3"));
        assertEquals(0, test.solution("0"));
        assertEquals(124, test.solution("500"));
    }
}