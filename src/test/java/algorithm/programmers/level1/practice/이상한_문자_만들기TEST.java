package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 이상한_문자_만들기TEST implements TEST {

    private 이상한_문자_만들기 test;
    
    @BeforeEach
    public void setup() {
        test = new 이상한_문자_만들기();
    }
    
    @Test
    public void solutionTest() {
        assertEquals("TrY HeLlO WoRlD", test.solution("try hello world"));
    }
    
}
