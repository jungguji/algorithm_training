package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 나누어_떨어지는_숫자_배열TEST implements TEST {

    private 나누어_떨어지는_숫자_배열 test;
    
    @BeforeEach
    public void setup() {
        test = new 나누어_떨어지는_숫자_배열();
    }
    
    @Test
    public void solutionTest() {
        assertArrayEquals(new int[] {5,10}, test.solution(new int[] {5,9,7,10}, 5));
        assertArrayEquals(new int[] {1,2,3,36}, test.solution(new int[] {2,36,1,3}, 1));
        assertArrayEquals(new int[] {-1}, test.solution(new int[] {3,2,6}, 10));
    }

}
