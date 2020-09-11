package algorithm.baekjoon.class2.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 나무_자르기Test {

    private 나무_자르기 test;

    @BeforeEach
    void setUp() {
        test = new 나무_자르기();
    }

    @Test
    void solution() {
        assertEquals(15, test.solution(new long[] {20, 15, 10, 17}, 7));
        assertEquals(3, test.solution(new long[] {6, 6}, 5));
        assertEquals(4, test.solution(new long[] {6, 6, 6, 6}, 6));
        assertEquals(500000000, test.solution(new long[] {900000000, 900000000, 900000000, 900000000, 900000000}, 2000000000));
        assertEquals(19, test.solution(new long[] {20, 15, 10, 17}, 1));
        assertEquals(0, test.solution(new long[] {2, 2}, 3));
        assertEquals(21, test.solution(new long[] {13, 23, 21, 32}, 12));
        assertEquals(2, test.solution(new long[] {1,4,5,7}, 10));
        assertEquals(1, test.solution(new long[] {51, 1}, 50));
        assertEquals(999999999, test.solution(new long[] {1000000000}, 1));
        assertEquals(0, test.solution(new long[] {2, 2,2,2}, 8));
    }
}