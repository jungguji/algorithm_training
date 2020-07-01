package algorithm.programmers.level1.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 키패드_누르기Test {

    private 키패드_누르기 test;

    @BeforeEach
    void setUp() {
        test = new 키패드_누르기();
    }

    @Test
    void solution() {
        assertEquals("LRLLLRLLRRL", test.solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        assertEquals("LRLLRRLLLRR", test.solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        assertEquals("LLRLLRLLRL", test.solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
    }
}