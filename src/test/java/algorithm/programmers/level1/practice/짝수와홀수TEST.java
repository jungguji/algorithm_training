package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 짝수와홀수TEST implements TEST {

    private 짝수와홀수 test;

    @BeforeEach
    public void setup() {
        test = new 짝수와홀수();
    }

    @Test
    public void solutionTest() {
        assertEquals("Odd", test.solution(3));
        assertEquals("Even", test.solution(4));
    }

}
