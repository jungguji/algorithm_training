package algorithm.baekjoon.class3.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 계단_오르기Test {

    private 계단_오르기 test;

    @BeforeEach
    void setUp() {
         test = new 계단_오르기();
    }

    @Test
    void solution() {
        assertEquals(75, test.solution(new int[]{10,20,15,25,10,20}));
        assertEquals(100, test.solution(new int[]{100}));
        assertEquals(200, test.solution(new int[]{100, 100}));
        assertEquals(60, test.solution(new int[]{10, 10, 15, 10, 20, 15, 10}));
        assertEquals(70, test.solution(new int[] {10, 10, 15, 10 , 20, 15, 20}));
        assertEquals(65, test.solution(new int[] {1 , 10, 15, 10 , 20, 15, 20}));
        assertEquals(152, test.solution(new int[] {10, 12, 15, 100, 20, 15, 10}));
        assertEquals(70, test.solution(new int[] {10, 10, 15, 20 , 10, 15, 10}));
        assertEquals(160, test.solution(new int[] {10, 12, 15, 100, 20, 25, 10}));
        assertEquals(5, test.solution(new int[] {1,2,3}));
        assertEquals(20, test.solution(new int[] {8,3,5,8,1}));
        assertEquals(81, test.solution(new int[] {20,1,20,1,20,1,20,5,1}));
        assertEquals(120, test.solution(new int[] {50,40,30,20,10}));
        assertEquals(8, test.solution(new int[] {1,2,3,4}));
    }
}