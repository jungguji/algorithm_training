package algorithm.baekjoon.bfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 단지번호붙이기Test {

    private 단지번호붙이기 test;

    @BeforeEach
    void setUp() {
        test = new 단지번호붙이기();
    }

    @Test
    void solution() {
        int[][] complex = new int[][] {
                {0,1,1,0,1,0,0}
                ,{0,1,1,0,1,0,1}
                ,{1,1,1,0,1,0,1}
                ,{0,0,0,0,1,1,1}
                ,{0,1,0,0,0,0,0}
                ,{0,1,1,1,1,1,0}
                ,{0,1,1,1,0,0,0}
        };
        assertArrayEquals(new int[] {3,7,8,9}, test.solution(complex));
        int[][] complex1 = new int[][] {
                {0,1,1,0,1,0,0}
                ,{0,1,1,0,1,0,1}
                ,{1,1,1,0,1,0,1}
                ,{0,0,0,0,1,1,1}
                ,{0,1,0,0,0,0,0}
                ,{0,1,1,1,1,1,0}
                ,{1,0,1,1,0,0,0}
        };
        assertArrayEquals(new int[] {4,1,7,8,8}, test.solution(complex1));

        int[][] complex2 = new int[][] {
                {0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0}
                ,{0,0,0,1,0,0,0}
                ,{0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0}
        };
        assertArrayEquals(new int[] {1,1}, test.solution(complex2));

        int[][] complex3 = new int[][] {
                {1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1}
        };
        assertArrayEquals(new int[] {1,49}, test.solution(complex3));
    }
}