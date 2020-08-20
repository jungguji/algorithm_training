package algorithm.baekjoon.class2.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 달팽이는_올라가고_싶다Test {

    @Test
    void solution() {
        달팽이는_올라가고_싶다 test = new 달팽이는_올라가고_싶다();

        assertEquals(4, test.solution(new int[] {2,1,5}));
        assertEquals(2, test.solution(new int[] {5,1,6}));
        assertEquals(999999901, test.solution(new int[] {100,99,1000000000}));
        assertEquals(1, test.solution(new int[] {5,0,5}));
        assertEquals(4, test.solution(new int[] {3,2,6}));
        assertEquals(2, test.solution(new int[] {100,1,101}));
        assertEquals(3, test.solution(new int[] {3,1,6}));
    }
}