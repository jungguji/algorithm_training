package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 핸드폰_번호_가리기TEST implements TEST {

    private 핸드폰_번호_가리기 test;
    
    @BeforeEach
    public void setup() {
        test = new 핸드폰_번호_가리기();
    }

    @Test
    public void solutionTest() {
        assertEquals("*******4444", test.solution("01033334444"));
        assertEquals("*****8888", test.solution("027778888"));
    }

}
