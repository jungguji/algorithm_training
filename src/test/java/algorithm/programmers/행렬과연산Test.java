package algorithm.programmers;

import algorithm.programmers.level4.structure.행렬과연산;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 행렬과연산Test {

    @Test
    void solution() {
        행렬과연산 test = new 행렬과연산();
        int[][] solution = test.solution(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new String[]{"Rotate", "ShiftRow"});
        assertArrayEquals(new int[][]{{8, 9, 6}, {4, 1, 2}, {7, 5, 3}}, solution);
    }

    @Test
    void solution1() {
        행렬과연산 test = new 행렬과연산();
        int[][] solution = test.solution(new int[][]{{8, 6, 3}, {3, 3, 7}, {8, 4, 9}}, new String[]{"Rotate", "ShiftRow", "ShiftRow"});
        assertArrayEquals(new int[][]{{8, 3, 3}, {4, 9, 7}, {3, 8, 6}}, solution);
    }

    @Test
    void solution2() {
        행렬과연산 test = new 행렬과연산();
        int[][] solution = test.solution(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}, new String[]{"ShiftRow", "Rotate", "ShiftRow", "Rotate"});
        assertArrayEquals(new int[][]{{1, 6, 7 ,8}, {5, 9, 10, 4}, {2, 3, 12, 11}}, solution);
    }
}