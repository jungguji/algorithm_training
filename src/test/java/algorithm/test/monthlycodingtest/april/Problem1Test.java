package algorithm.test.monthlycodingtest.april;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    private Problem1 problem1;

    @BeforeEach
    void setUp() {
        this.problem1 = new Problem1();
    }

    @Test
    void solution() {
        assertEquals(9, problem1.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
    }
}