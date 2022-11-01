package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N개의_최소공배수Test {

    private N개의_최소공배수 test;

    @BeforeEach
    void setUp() {
        test = new N개의_최소공배수();
    }

    @Test
    void solution() {
        assertEquals(168, test.solution(new int[]{2, 6, 8, 14}));
        assertEquals(6, test.solution(new int[]{1, 2, 3}));
        assertEquals(35945910, test.solution(new int[]{38, 98, 22, 14, 49, 6, 35, 2, 65, 54}));
        assertEquals(1020, test.solution(new int[]{17, 3, 6, 20}));
    }
}