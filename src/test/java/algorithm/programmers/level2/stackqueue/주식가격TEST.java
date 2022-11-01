package algorithm.programmers.level2.stackqueue;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 주식가격TEST implements TEST {

    private 주식가격 test;

    @BeforeEach
    public void setup() {
        test = new 주식가격();
    }

    @Test
    public void solutionTest() {
        assertArrayEquals(new int[]{4, 3, 1, 1, 0}, test.solution(new int[]{1, 2, 3, 2, 3}));
        assertArrayEquals(new int[]{2, 1, 0}, test.solution(new int[]{7, 7, 6}));
        assertArrayEquals(new int[]{2, 1, 1, 1, 0}, test.solution(new int[]{7, 7, 6, 5, 5}));
    }

}
