import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 레벨2_1번Test implements TEST {

    private 레벨2_1번 test;
    
    @BeforeEach
    public void setup() {
        test = new 레벨2_1번();
    }

    @Test
    public void solutionTest() {
        int[][] picture = new int[][] {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        int m = 6;
        int n = 4;
        
        assertArrayEquals(new int[] {4 , 5}, test.solution(m, n, picture));
    }

}
