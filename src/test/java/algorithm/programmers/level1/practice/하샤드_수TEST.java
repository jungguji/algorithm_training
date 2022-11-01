package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 하샤드_수TEST implements TEST {

    private 하샤드_수 test;

    @BeforeEach
    public void setup() {
        test = new 하샤드_수();
    }

    @Test
    public void solutionTest() {
        assertTrue(test.solution(10));
        assertTrue(test.solution(12));
        assertFalse(test.solution(11));
        assertFalse(test.solution(13));
    }

}
