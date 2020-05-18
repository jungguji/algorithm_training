package algorithm.programmers.level2.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 큰_수_만들기TEST implements TEST {

    private 큰_수_만들기 test;
    
    @BeforeEach
    public void setup() {
        test = new 큰_수_만들기();
    }

    @Test
    public void solutionTest() {
        assertEquals("23", test.solution("123", 2));
        assertEquals("34", test.solution("1234", 2));
        assertEquals("94", test.solution("1924", 2));
        assertEquals("3234", test.solution("1231234", 3));
        assertEquals("775841", test.solution("4177252841", 4));
        assertEquals("9", test.solution("9999999999", 9));
        assertEquals("93231357719", test.solution("9312131357719", 2));
    }
}
