package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Year2016TEST {
    private Year2016 test;
    
    @BeforeEach
    public void setup() {
        test = new Year2016();
    }
    
    @Test
    public void solutionTest() {
        assertEquals("FRI", test.solution(1, 1));
        assertEquals("TUE", test.solution(5, 24));
        assertEquals("SUN", test.solution(7, 24));
        assertEquals("THU", test.solution(7, 28));
    }
}
