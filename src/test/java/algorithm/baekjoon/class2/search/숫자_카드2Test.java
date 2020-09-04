package algorithm.baekjoon.class2.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 숫자_카드2Test {

    private 숫자_카드2 test;

    @BeforeEach
    void setUp() {
        test = new 숫자_카드2();
    }

    @Test
    void solution() {
        assertArrayEquals(new int[] {3, 0, 0, 1, 2, 0, 0, 2}, test.solution(new int[] {6, 3, 2, 10, 10, 10, -10, -10, 7, 3}, new int[] {10, 9, -5, 2, 3, 4, 5, -10}));
    }
}