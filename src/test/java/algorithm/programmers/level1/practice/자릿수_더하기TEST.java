package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 자릿수_더하기TEST implements TEST {

    private 자릿수_더하기 test;

    @BeforeEach
    public void setup() {
        test = new 자릿수_더하기();
    }

    @Test
    public void solutionTest() {
        assertEquals(6, test.solution(123));
        assertEquals(24, test.solution(987));
    }

}
