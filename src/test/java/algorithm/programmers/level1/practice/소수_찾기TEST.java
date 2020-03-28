package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 소수_찾기TEST implements TEST {

    private 소수_찾기 test;
    
    @BeforeEach
    public void setup() {
        test = new 소수_찾기();
    }

    @Test
    public void solutionTest() {
        assertEquals(4, test.solution(10));
        assertEquals(3, test.solution(5));
    }

}
