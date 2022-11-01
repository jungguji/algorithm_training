package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 문자열_다루기_기본TEST implements TEST {

    private 문자열_다루기_기본 test;

    @BeforeEach
    public void setup() {
        test = new 문자열_다루기_기본();
    }

    @Test
    public void solutionTest() {
        assertFalse(test.solution("a234"));
        assertTrue(test.solution("1234"));
    }

}
