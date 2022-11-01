package algorithm.baekjoon.class2.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 수찾기Test {

    private 수찾기 test;

    @BeforeEach
    void setUp() {
        test = new 수찾기();
    }

    @Test
    void solution() {
        assertArrayEquals(new int[]{1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0}, test.solution(new int[]{1, 3, 4, 6, 9, 13, 18}, new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}));
        assertArrayEquals(new int[]{1, 1, 0, 0, 1}, test.solution(new int[]{4, 1, 5, 2, 3}, new int[]{1, 3, 7, 9, 5}));
        assertArrayEquals(new int[]{1}, test.solution(new int[]{1, 2}, new int[]{2}));
        assertArrayEquals(new int[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 1}, test.solution(new int[]{2, 4, 6, 8, 10}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}