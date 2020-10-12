package algorithm.programmers.level3.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoXn_타일링Test {

    private TwoXn_타일링 test;

    @BeforeEach
    void setUp() {
        test = new TwoXn_타일링();
    }

    @Test
    void solution() {
        assertEquals(5, test.solution(4));
        assertEquals(3, test.solution(3));
        assertEquals(8, test.solution(5));
        assertEquals(316290802, test.solution(52));
    }
}