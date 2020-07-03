package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 수식_최대화Test {

    private 수식_최대화 test;

    @BeforeEach
    void setUp() {
        test = new 수식_최대화();
    }

    @Test
    void solution() {
        assertEquals(60420, test.solution("100-200*300-500+20"));
        assertEquals(300, test.solution("50*6-3*2"));
    }
}