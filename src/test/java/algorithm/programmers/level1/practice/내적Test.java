package algorithm.programmers.level1.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 내적Test {

    private 내적 test;

    @BeforeEach
    void setUp() {
        this.test = new 내적();
    }

    @Test
    void solution() {
        assertEquals(3, test.solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2}));
        assertEquals(-2, test.solution(new int[]{-1,0,1}, new int[]{1,0,-1}));
    }
}