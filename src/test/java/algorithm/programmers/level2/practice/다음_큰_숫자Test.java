package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 다음_큰_숫자Test {

    private 다음_큰_숫자 test;

    @BeforeEach
    void setUp() {
        test = new 다음_큰_숫자();
    }

    @Test
    void solution() {
        assertEquals(83, test.solution(78));
        assertEquals(23, test.solution(15));
    }
}