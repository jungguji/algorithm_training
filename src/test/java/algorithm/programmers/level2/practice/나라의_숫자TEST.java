package algorithm.programmers.level2.practice;

import algorithm.programmers.level1.practice.TEST;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 나라의_숫자TEST implements TEST {

    private 나라의_숫자 test;
    
    @BeforeEach
    public void setup() {
        test = new 나라의_숫자();
    }

    @Test
    public void solutionTest() {
        assertEquals("421211211121241112", test.solution(500000000));
        assertEquals("1", test.solution(1));
        assertEquals("2", test.solution(2));
        assertEquals("21", test.solution(7));
        assertEquals("11", test.solution(4));
        assertEquals("422", test.solution(35));
        assertEquals("24", test.solution(9));
        assertEquals("142", test.solution(20));
        assertEquals("121", test.solution(16));
    }

}
