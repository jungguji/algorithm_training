package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class qqqqTEST implements TEST {

    private qqqq test;
    
    @BeforeEach
    public void setup() {
        test = new qqqq();
    }

    @Test
    public void solutionTest() {
      assertArrayEquals(new int[] {3,4,2,1,5}, test.solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3}));
      assertArrayEquals(new int[] {4,1,2,3}, test.solution(4, new int[] {4,4,4,4,4}));
      assertArrayEquals(new int[] {2,1,3,4}, test.solution(4, new int[] {1,1,1,1,2}));
    }

}
