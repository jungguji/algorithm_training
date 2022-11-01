package algorithm.kakao.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class April_3_TwoTest {

    private April_3_Two test;

    @BeforeEach
    void setUp() {
        this.test = new April_3_Two();
    }

    @Test
    void solution() {
        int[][] needs = new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1}};
        assertEquals(4, test.solution(needs, 2));
    }

    @Test
    void solution1() {
        int[][] needs = new int[][]{{1, 0, 0}, {1, 0, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1}};
        assertEquals(4, test.solution(needs, 2));
    }
}