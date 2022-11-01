package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 콜라츠_추측TEST implements TEST {

    private 콜라츠_추측 test;

    @BeforeEach
    public void setup() {
        test = new 콜라츠_추측();
    }

    @Test
    public void solutionTest() {
        assertEquals(8, test.solution(6));
        assertEquals(4, test.solution(16));
        assertEquals(-1, test.solution(626331));
        assertEquals(0, test.solution(1));
    }

}
