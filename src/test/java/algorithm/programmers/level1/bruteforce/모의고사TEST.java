package algorithm.programmers.level1.bruteforce;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 모의고사TEST {
    
    private 모의고사 test;
    
    @BeforeEach
    public void setup() {
        test = new 모의고사();
    }
    
    @Test
    public void solutionTest() {
        int[] answers = {1,3,2,4,2};
        int[] expecteds = {1,2,3};
        int[] actuals = test.solution(answers);
        
        assertArrayEquals(expecteds, actuals);
    }
}
