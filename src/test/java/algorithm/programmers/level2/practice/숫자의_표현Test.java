package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 숫자의_표현Test {

    private 숫자의_표현 test;

    @BeforeEach
    void setUp() {
        test = new 숫자의_표현();
    }

    @Test
    void solution() {
        assertEquals(4, test.solution(15));
        assertEquals(2, test.solution(20));
        assertEquals(4, test.solution(30));
        assertEquals(2, test.solution(106));
        assertEquals(2, test.solution(1567));
        assertEquals(1, test.solution(16));
        assertEquals(4, test.solution(782));
        assertEquals(5, test.solution(10000));
        assertEquals(12, test.solution(9999));
        assertEquals(4, test.solution(7787));
        assertEquals(8, test.solution(4578));
        assertEquals(2, test.solution(1234));
        assertEquals(1, test.solution(1));
        assertEquals(2, test.solution(5));
        assertEquals(3, test.solution(49));
    }
    @Test
    void solution2() {
        assertEquals(4, test.solution2(15));
        assertEquals(2, test.solution2(20));
        assertEquals(4, test.solution2(30));
        assertEquals(2, test.solution2(106));
        assertEquals(2, test.solution2(1567));
        assertEquals(1, test.solution2(16));
        assertEquals(4, test.solution2(782));
        assertEquals(5, test.solution2(10000));
        assertEquals(12, test.solution2(9999));
        assertEquals(4, test.solution2(7787));
        assertEquals(8, test.solution2(4578));
        assertEquals(2, test.solution2(1234));
        assertEquals(1, test.solution2(1));
        assertEquals(2, test.solution2(5));
        assertEquals(3, test.solution2(49));
    }
}