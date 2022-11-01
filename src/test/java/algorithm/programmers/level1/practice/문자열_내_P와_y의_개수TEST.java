package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 문자열_내_P와_y의_개수TEST implements TEST {

    private 문자열_내_P와_y의_개수 test;

    @BeforeEach
    public void setup() {
        test = new 문자열_내_P와_y의_개수();
    }

    @Test
    public void solutionTest() {
        assertTrue(test.solution("pPoooyY"));
        assertFalse(test.solution("Pyy"));
    }

}
