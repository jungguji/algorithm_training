package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 문자열을_정수로_바꾸기TEST implements TEST {

    private 문자열을_정수로_바꾸기 test;
    
    @BeforeEach
    public void setup() {
        test = new 문자열을_정수로_바꾸기();
    }

    @Test
    public void solutionTest() {
        assertEquals(1234, test.solution("1234"));
        assertEquals(-1234, test.solution("-1234"));
    }

}
