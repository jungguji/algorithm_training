package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 예산TEST implements TEST {

    private 예산 test;

    @BeforeEach
    public void setup() {
        test = new 예산();
    }

    @Test
    public void solutionTest() {
        assertEquals(3, test.solution(new int[]{1, 3, 2, 5, 4}, 9));
        assertEquals(4, test.solution(new int[]{2, 2, 3, 3}, 10));
    }

}
