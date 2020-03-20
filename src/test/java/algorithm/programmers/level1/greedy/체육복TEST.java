package algorithm.programmers.level1.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 체육복TEST {
    private 체육복 test;
    
    @BeforeEach
    public void setup() {
        test = new 체육복();
    }
    
    @Test
    public void solutionTest() {
        int n = 8;
        int[] lost = {3, 7};
        int[] reserve = {2, 4};
        
        int actual = test.solution(n, lost, reserve);
        
        int expected = 7;
        assertEquals(expected, actual);
        assertEquals(5, test.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        assertEquals(4, test.solution(5, new int[]{2, 4}, new int[]{3}));
        assertEquals(4, test.solution(5, new int[]{1, 2}, new int[]{2, 3}));
        assertEquals(2, test.solution(3, new int[]{1, 2}, new int[]{2, 3}));
        assertEquals(3, test.solution(3, new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertEquals(2, test.solution(3, new int[]{3}, new int[]{1}));
        assertEquals(6, test.solution(7, new int[]{2, 3, 4}, new int[]{1, 2, 3, 6}));
        assertEquals(4, test.solution(5, new int[]{2, 3, 4}, new int[]{3, 4, 5}));
    }
}
