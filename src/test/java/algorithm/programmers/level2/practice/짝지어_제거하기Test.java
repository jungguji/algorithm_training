package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 짝지어_제거하기Test {

    private 짝지어_제거하기 test;

    @BeforeEach
    void setUp() {
        test = new 짝지어_제거하기();
    }

    @Test
    void solution() {
        assertEquals(1, test.solution("baabaa"));
        assertEquals(0, test.solution("cdcd"));
    }
}