package algorithm.programmers.level2.bruteforce;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 카펫Test {

    private 카펫 test;

    @BeforeEach
    void setUp() {
        test = new 카펫();
    }

    @Test
    void solution() {
        assertArrayEquals(new int[]{4, 3}, test.solution(10, 2));
        assertArrayEquals(new int[]{3, 3}, test.solution(8, 1));
        assertArrayEquals(new int[]{8, 6}, test.solution(24, 24));
    }
}