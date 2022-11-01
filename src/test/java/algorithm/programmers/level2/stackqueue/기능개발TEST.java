package algorithm.programmers.level2.stackqueue;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 기능개발TEST implements TEST {

    private 기능개발 test;

    @BeforeEach
    public void setup() {
        test = new 기능개발();
    }

    @Test
    public void solutionTest() {
        assertArrayEquals(new int[]{2, 1}, test.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));
        assertArrayEquals(new int[]{3}, test.solution(new int[]{0, 30, 55}, new int[]{1, 99, 99}));
        assertArrayEquals(new int[]{1, 1, 1}, test.solution(new int[]{3, 2, 1}, new int[]{1, 1, 1}));
    }

}
