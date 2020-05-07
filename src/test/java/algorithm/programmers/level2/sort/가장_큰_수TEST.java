package algorithm.programmers.level2.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;
import algorithm.programmers.level2.sort.가장_큰_수;

public class 가장_큰_수TEST implements TEST {

    private 가장_큰_수 test;
    
    @BeforeEach
    public void setup() {
        test = new 가장_큰_수();
    }

    @Test
    public void solutionTest() {
        assertEquals("6210", test.solution(new int[] {6, 10, 2}));
        assertEquals("9534330", test.solution(new int[] {3, 30, 34, 5, 9}));
        assertEquals("220200", test.solution(new int[] {2,200,20}));
        assertEquals("2200", test.solution(new int[] {2,0,20}));
        assertEquals("0", test.solution(new int[] {0,0,0}));
        assertEquals("21212", test.solution(new int[] {12, 212}));
        assertEquals("21221", test.solution(new int[] {212, 21}));
        assertEquals("7000", test.solution(new int[] {0, 0, 70}));
        assertEquals("1000000", test.solution(new int[] {0, 0, 0, 1000}));
    }

}
