package algorithm.baekjoon.class3.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IOITest {

    private IOI test;

    @BeforeEach
    void setUp() {
        test = new IOI();
    }

    @Test
    void solution() {
        assertEquals(4, test.solution(1, "OOIOIOIOIIOII"));
        assertEquals(6, test.solution(2, "OOIOIIOIOIOIOIOIOIOIOOIOI"));
        assertEquals(7, test.solution(1, "IOIOIOIOIOIOIOI"));
    }
}