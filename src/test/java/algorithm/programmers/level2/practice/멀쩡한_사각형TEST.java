package algorithm.programmers.level2.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 멀쩡한_사각형TEST implements TEST {

    private 멀쩡한_사각형 test;

    @BeforeEach
    public void setup() {
        test = new 멀쩡한_사각형();
    }

    @Test
    public void solutionTest() {
        assertEquals(80, test.solution(8, 12));
        assertEquals(12, test.solution(5, 4));
        assertEquals(40, test.solution(10, 5));
        assertEquals(352, test.solution(17, 23));
        assertEquals(30467460, test.solution(3, 15233730));
    }

}
