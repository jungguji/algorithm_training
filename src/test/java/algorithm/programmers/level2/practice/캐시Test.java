package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 캐시Test {

    private 캐시 test;

    @BeforeEach
    void setUp() {
        test = new 캐시();
    }

    @Test
    void solution() {
        assertEquals(42, test.solution(3, new String[]{"Jeju", "Pangyo", "Jeju", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
        assertEquals(50, test.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
        assertEquals(21, test.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
        assertEquals(60, test.solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        assertEquals(52, test.solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        assertEquals(16, test.solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
        assertEquals(25, test.solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
        assertEquals(18, test.solution(1, new String[]{"LA", "LA", "LA", "LA", "LA", "LA", "LA", "LA", "LA", "LA", "LA", "LA", "LA", "LA"}));
    }
}