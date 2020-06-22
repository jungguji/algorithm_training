package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 가장_큰_정사각형_찾기Test {

    private 가장_큰_정사각형_찾기 test;

    @BeforeEach
    void setUp() {
        test = new 가장_큰_정사각형_찾기();
    }

    @Test
    void solution() {
        assertEquals(9, test.solution(new int[][]{{0,1,1,1} ,{1,1,1,1},{1,1,1,1},{0,0,1,0}}));
        assertEquals(4, test.solution(new int[][]{{0,0,1,1} ,{1,1,1,1}}));
        assertEquals(1, test.solution(new int[][]{{0,0,1,1}}));
    }
}