package algorithm.programmers.level1.practice;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 자연수_뒤집어_배열로_만들기TEST implements TEST {

    private 자연수_뒤집어_배열로_만들기 test;
    
    @BeforeEach
    public void setup() {
        test = new 자연수_뒤집어_배열로_만들기();
    }

    @Test
    public void solutionTest() {
        assertArrayEquals(new int[] {5, 4,3,2,1}, test.solution(12345));
    }

}
