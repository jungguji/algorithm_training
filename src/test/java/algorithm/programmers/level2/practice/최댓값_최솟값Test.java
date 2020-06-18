package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 최댓값_최솟값Test {

    private 최댓값_최솟값 test;

    @BeforeEach
    void setUp() {
        test = new 최댓값_최솟값();
    }

    @Test
    void solution() {
        assertEquals("1 4", test.solution("1 2 3 4"));
        assertEquals("-4 -1", test.solution("-1 -2 -3 -4"));
        assertEquals("-1 -1", test.solution("-1 -1"));
    }
}