package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 수박수박수박수박수박수TEST implements TEST {

    private 수박수박수박수박수박수 test;

    @BeforeEach
    public void setup() {
        test = new 수박수박수박수박수박수();
    }

    @Test
    public void solutionTest() {
        assertEquals("수박수", test.solution(3));
        assertEquals("수박수박", test.solution(4));
    }

}
