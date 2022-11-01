package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 정수_제곱근_판별TEST implements TEST {

    private 정수_제곱근_판별 test;

    @BeforeEach
    public void setup() {
        test = new 정수_제곱근_판별();
    }

    @Test
    public void solutionTest() {
        assertEquals(144, test.solution(121));
        assertEquals(-1, test.solution(3));
    }

}
