package algorithm.programmers.level1.practice;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 제일_작은_수_제거하기TEST implements TEST {

    private 제일_작은_수_제거하기 test;
    
    @BeforeEach
    public void setup() {
        test = new 제일_작은_수_제거하기();
    }

    @Test
    public void solutionTest() {
        assertArrayEquals(new int[] {4, 3,2}, test.solution(new int[] {4,3,2,1}));
        assertArrayEquals(new int[] {-1}, test.solution(new int[] {10}));
    }

}
