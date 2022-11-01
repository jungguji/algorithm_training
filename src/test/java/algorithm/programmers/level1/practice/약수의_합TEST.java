package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 약수의_합TEST implements TEST {

    private 약수의_합 test;

    @BeforeEach
    public void setup() {
        test = new 약수의_합();
    }

    @Test
    public void solutionTest() {
//        assertEquals(28, test.solution(12));
//        assertEquals(6, test.solution(5));
//        assertEquals(9360, test.solution(3000));
//        assertEquals(48, test.solution(33));
        assertEquals(1, test.solution2(1));
    }
}
