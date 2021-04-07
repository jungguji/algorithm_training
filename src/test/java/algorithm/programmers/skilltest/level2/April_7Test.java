package algorithm.programmers.skilltest.level2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class April_7Test {

    private April_7 test;

    @BeforeEach
    void setUp() {
        this.test = new April_7();
    }

    @Test
    void solution() {
        assertEquals(3, test.solution(new int[]{70,50,80,50}, 100));
        assertEquals(3, test.solution(new int[]{70, 80, 50}, 100));
    }
}