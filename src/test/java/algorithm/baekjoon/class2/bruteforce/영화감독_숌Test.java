package algorithm.baekjoon.class2.bruteforce;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 영화감독_숌Test {

    private 영화감독_숌 test;

    @BeforeEach
    void setUp() {
        test = new 영화감독_숌();
    }

    @Test
    void solution() {
        assertEquals(1666, test.solution(2));
        assertEquals(256664, test.solution(666));
        assertEquals(6661, test.solution(8));
        assertEquals(6666, test.solution(13));
        assertEquals(6667, test.solution(14));
        assertEquals(6669, test.solution(16));
        assertEquals(10666, test.solution(20));
        assertEquals(15666, test.solution(25));
        assertEquals(17666, test.solution(36));
        assertEquals(666, test.solution(1));
        assertEquals(1466659, test.solution(5000));
        assertEquals(60666, test.solution(115));
    }
}