package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 행렬의_곱셈Test {

    private 행렬의_곱셈 test;

    @BeforeEach
    void setUp() {
        test = new 행렬의_곱셈();
    }

    @Test
    void solution() {
        assertArrayEquals(new int[][]{{15, 15}, {15, 15}, {15, 15}}, test.solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}}));
        assertArrayEquals(new int[][]{{22, 22, 11}, {36, 28, 18}, {29, 20, 14}}, test.solution(new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}, new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}}));
    }
}