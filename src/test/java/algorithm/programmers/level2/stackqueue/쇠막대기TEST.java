package algorithm.programmers.level2.stackqueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 쇠막대기TEST implements TEST {

    private 쇠막대기 test;
    
    @BeforeEach
    public void setup() {
        test = new 쇠막대기();
    }

    @Test
    public void solutionTest() {
        assertEquals(17, test.solution("()(((()())(())()))(())"));
        assertEquals(18, test.solution("(((((((((())))))))))"));
    }

}
