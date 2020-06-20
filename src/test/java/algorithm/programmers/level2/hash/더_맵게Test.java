package algorithm.programmers.level2.hash;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 더_맵게Test {

    private 더_맵게 test;

    @BeforeEach
    void setUp() {
        test = new 더_맵게();
    }

    @Test
    void solution() {
//        assertEquals(2, test.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
//        assertEquals(1, test.solution(new int[]{1, 2}, 2));
        assertEquals(-1, test.solution(new int[]{1, 100}, 1000000000));
    }
}