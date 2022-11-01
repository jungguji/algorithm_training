package algorithm.programmers.level2.stackqueue;

import algorithm.programmers.level1.practice.TEST;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 다리를_지나는_트럭TEST implements TEST {

    private 다리를_지나는_트럭 test;

    @BeforeEach
    public void setup() {
        test = new 다리를_지나는_트럭();
    }

    @Test
    public void solutionTest() {
        assertEquals(8, test.solution(2, 10, new int[]{7, 4, 5, 6}));
        assertEquals(101, test.solution(100, 100, new int[]{10}));
        assertEquals(110, test.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }

}
