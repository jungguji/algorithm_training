package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 폰켓몬Test {

    private 폰켓몬 test;

    @BeforeEach
    void setUp() {
        test = new 폰켓몬();
    }

    @Test
    void solution() {
        assertEquals(2, test.solution(new int[]{3,1,2,3}));
        assertEquals(3, test.solution(new int[]{3,3,3,2,2,4}));
        assertEquals(2, test.solution(new int[]{3,3,3,2,2,2}));
    }
}