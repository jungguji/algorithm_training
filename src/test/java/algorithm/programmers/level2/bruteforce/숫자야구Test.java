package algorithm.programmers.level2.bruteforce;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 숫자야구Test {

    private 숫자야구 test;

    @BeforeEach
    void setUp() {
        test = new 숫자야구();
    }

    @Test
    void solution() {
        assertEquals(2, test.solution(new int[][] {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}}));
        assertEquals(2, test.solution(new int[][] {{659, 0, 1}, {264, 1, 1}, {126, 1, 2}}));
    }
}