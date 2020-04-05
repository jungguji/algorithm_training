package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 평균_구하기TEST implements TEST {

    private 평균_구하기 test;
    
    @BeforeEach
    public void setup() {
        test = new 평균_구하기();
    }

    @Test
    public void solutionTest() {
        assertEquals(2.5, test.solution(new int[] {1,2,3,4}));
        assertEquals(5, test.solution(new int[] {5,5}));
    }

}
