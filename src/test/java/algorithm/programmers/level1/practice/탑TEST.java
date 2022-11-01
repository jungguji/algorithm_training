package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 탑TEST implements TEST {

    private 탑 test;

    @BeforeEach
    public void setup() {
        test = new 탑();
    }

    @Test
    public void solutionTest() {
        assertArrayEquals(new int[]{0, 0, 2, 2, 4}, test.solution(new int[]{6, 9, 5, 7, 4}));
        assertArrayEquals(new int[]{0, 0, 0, 3, 3, 3, 6}, test.solution(new int[]{3, 9, 9, 3, 5, 7, 2}));
        assertArrayEquals(new int[]{0, 0, 2, 0, 0, 5, 6}, test.solution(new int[]{1, 5, 3, 6, 7, 6, 5}));
    }

}
