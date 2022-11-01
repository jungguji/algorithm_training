package algorithm.programmers.level2.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 구명보트TEST implements TEST {

    private 구명보트 test;

    @BeforeEach
    public void setup() {
        test = new 구명보트();
    }

    @Test
    public void solutionTest() {
        assertEquals(3, test.solution(new int[]{70, 50, 80, 50}, 100));
        assertEquals(3, test.solution(new int[]{70, 80, 50}, 100));
        assertEquals(2, test.solution(new int[]{40, 40, 80}, 160));
        assertEquals(2, test.solution(new int[]{20, 50, 50, 80}, 100));
        assertEquals(5, test.solution(new int[]{40, 50, 60, 70, 80, 90}, 100));
        assertEquals(2, test.solution(new int[]{40, 40, 40}, 100));
    }

}
