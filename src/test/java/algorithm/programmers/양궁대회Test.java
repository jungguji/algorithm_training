package algorithm.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 양궁대회Test {

    양궁대회 test;

    @BeforeEach
    void setUp() {
        test = new 양궁대회();
    }

    @Test
    void solution() {
        assertArrayEquals(new int[]{0,2,2,0,1,0,0,0,0,0,0}, test.solution(5, new int[]{2,1,1,1,0,0,0,0,0,0,0}));
    }

    @Test
    void solution1() {
        assertArrayEquals(new int[]{-1}, test.solution(1, new int[]{1,0,0,0,0,0,0,0,0,0,0}));
    }

    @Test
    void solution2() {
        assertArrayEquals(new int[]{1,1,2,0,1,2,2,0,0,0,0}, test.solution(9, new int[]{0,0,1,2,0,1,1,1,1,1,1}));
    }

    @Test
    void solution3() {
        assertArrayEquals(new int[]{1,1,1,1,1,1,1,1,0,0,2}, test.solution(10, new int[]{0,0,0,0,0,0,0,0,3,4,3}));
    }

    @Test
    void solution4() {
        assertArrayEquals(new int[]{-1}, test.solution(3, new int[]{1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0}));
    }
}