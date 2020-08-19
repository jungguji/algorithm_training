package algorithm.baekjoon.class2.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 블랙잭Test {

    private 블랙잭 test;
    @BeforeEach
    void setUp() {
        test = new 블랙잭();
    }

    @Test
    void solution() {
        assertEquals(21, test.solution(21, new int[]{5,6,7,8,9}));
        assertEquals(497, test.solution(500, new int[]{93, 181, 245, 214, 315, 36, 185, 138, 216, 295}));
        assertEquals(10, test.solution(10, new int[]{3, 1, 3, 1, 4}));
    }
}