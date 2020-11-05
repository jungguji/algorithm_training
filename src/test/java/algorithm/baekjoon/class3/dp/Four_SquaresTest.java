package algorithm.baekjoon.class3.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Four_SquaresTest {

    private Four_Squares test;

    @BeforeEach
    void setUp() {
        test = new Four_Squares();
    }

    @Test
    void solution() {
        assertEquals(1, test.solution(25));
        assertEquals(2, test.solution(26));
        assertEquals(3, test.solution(11339));
        assertEquals(4, test.solution(34567));
        assertEquals(3, test.solution(12));
    }
}