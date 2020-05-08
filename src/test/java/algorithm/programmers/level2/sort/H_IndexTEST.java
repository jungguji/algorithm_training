package algorithm.programmers.level2.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class H_IndexTEST implements TEST {

    private H_Index test;
    
    @BeforeEach
    public void setup() {
        test = new H_Index();
    }

    @Test
    public void solutionTest() {
        assertEquals(3, test.solution(new int[] {3,0,6,1,5}));
        assertEquals(3, test.solution(new int[] {6,5,4,3,1,1,1,1,1}));
        assertEquals(3, test.solution(new int[] {0, 1, 1, 1, 1, 3, 3, 4}));
        assertEquals(3, test.solution(new int[] {5, 5, 5, 0}));
        assertEquals(2, test.solution(new int[] {2,2,2,2,2}));
        assertEquals(4, test.solution(new int[] {5, 5, 5, 5}));
        assertEquals(5, test.solution(new int[] {5, 5, 5, 5, 5}));
        assertEquals(1, test.solution(new int[] {7}));
        assertEquals(3, test.solution(new int[] {4, 3, 3, 3, 3}));
        assertEquals(0, test.solution(new int[] {0,0,0,0,0,0}));
        assertEquals(3, test.solution(new int[] {6, 5, 3, 1, 0}));
    }

}
