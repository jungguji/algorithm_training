package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 두_정수_사이의_합TEST implements TEST {

    private 두_정수_사이의_합 test;
    @BeforeEach
    public void setup() {
        test = new 두_정수_사이의_합();
    }

    @Test
    public void solutionTest() {
        assertEquals(12, test.solution(3, 5));
        assertEquals(3, test.solution(3, 3));
        assertEquals(12, test.solution(5, 3));
        assertEquals(-2, test.solution(-2, 1));
    }
}