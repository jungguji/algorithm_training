package algorithm.baekjoon.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 동전_0TEST implements TEST {

    private 동전_0 test;

    @BeforeEach
    public void setup() {
        test = new 동전_0();
    }

    @Test
    public void solutionTest() {
        long[] array = new long[]{1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};
        assertEquals(6, test.solution(10, 4200, array));
        assertEquals(12, test.solution(10, 4790, array));
        assertEquals(1, test.solution(10, 50000, array));
        assertEquals(2000, test.solution(10, 100000000, array));

        array = new long[]{1};
        assertEquals(2, test.solution(1, 2, array));
        assertEquals(1, test.solution(1, 1, array));
        assertEquals(100000000, test.solution(1, 100000000, array));

        array = new long[]{1, 5};
        assertEquals(1, test.solution(2, 5, array));

        array = new long[]{1, 3};
        assertEquals(2, test.solution(2, 4, array));

        array = new long[]{1, 100};
        assertEquals(1, test.solution(2, 100, array));

        array = new long[]{5000};
        assertEquals(1, test.solution(1, 5000, array));
    }

}
