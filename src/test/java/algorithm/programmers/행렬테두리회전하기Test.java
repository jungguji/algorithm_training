package algorithm.programmers;

import algorithm.programmers.level2.bruteforce.행렬테두리회전하기;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 행렬테두리회전하기Test {

    @Test
    void test() {
        행렬테두리회전하기 행렬테두리회전하기 = new 행렬테두리회전하기();
        int rows = 6;
        int columns = 6;
        int[][] queries = new int[][] {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        int[] result = 행렬테두리회전하기.solution(rows, columns, queries);

        int[] expected = {8, 10, 25};
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    void test1() {
        행렬테두리회전하기 행렬테두리회전하기 = new 행렬테두리회전하기();
        int rows = 3;
        int columns = 3;
        int[][] queries = new int[][] {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}};
        int[] result = 행렬테두리회전하기.solution(rows, columns, queries);

        int[] expected = {1, 1, 5, 3};
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    void test2() {
        행렬테두리회전하기 행렬테두리회전하기 = new 행렬테두리회전하기();
        int rows = 100;
        int columns = 97;
        int[][] queries = new int[][] {{1,1,100,97}};
        int[] result = 행렬테두리회전하기.solution(rows, columns, queries);

        int[] expected = {1};
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }
}