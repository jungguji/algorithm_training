package algorithm.programmers.level1.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 햄버거_만들기Test {

    private final 햄버거_만들기 test = new 햄버거_만들기();

    @Test
    void solution() {

        assertEquals(2, test.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
        assertEquals(0, test.solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
        assertEquals(1, test.solution(new int[]{1, 2, 3, 1, 1, 1, 1, 1, 1}));
        assertEquals(2, test.solution(new int[]{1,2,3,1,2,3,1,2,3,1,2,3,1,1,1,1}));
        assertEquals(0, test.solution(new int[]{1}));
        assertEquals(3, test.solution(new int[]{1,2,3,1,1,2,1,2,3,1,3,1}));
    }
}