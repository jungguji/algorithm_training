package algorithm.programmers.level1.practice;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 같은_숫자는_싫어TEST {

    private 같은_숫자는_싫어 test;
    
    @BeforeEach
    public void setup() {
        test = new 같은_숫자는_싫어();
    }
    
    @Test
    public void solutionTest() {
        assertArrayEquals(new int[] {1,3,0,1}, test.solution(new int[] {1,1,3,3,0,1,1}));
        assertArrayEquals(new int[] {4,3}, test.solution(new int[] {4,4,4,3,3}));
        assertArrayEquals(new int[] {1,3}, test.solution(new int[] {1,1,1,1,3}));
        assertArrayEquals(new int[] {1,3}, test.solution(new int[] {1,1,1,1,3}));
    }
}
