package algorithm.programmers.level2.stackqueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 프린터TEST implements TEST {

    private 프린터 test;

    @BeforeEach
    public void setup() {
        test = new 프린터();
    }

    @Test
    public void solutionTest() {
        assertEquals(1, test.solution(new int[]{2, 1, 3, 2}, 2));
        assertEquals(5, test.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
        assertEquals(6, test.solution(new int[]{2, 2, 2, 1, 3, 4}, 3));
        assertEquals(2, test.solution(new int[]{1, 2, 3, 2}, 3));
    }

}
