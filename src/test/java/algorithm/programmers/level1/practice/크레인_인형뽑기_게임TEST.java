package algorithm.programmers.level1.practice;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 크레인_인형뽑기_게임TEST implements TEST {

    private 크레인_인형뽑기_게임 test;
    
    @BeforeEach
    public void setup() {
        test = new 크레인_인형뽑기_게임();
    }

    @Test
    public void solutionTest() {
        int[][] board = new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        
        assertEquals(4, test.solution(board, moves));
    }
    
//    @Test
//    public void setTopTEST() {
//        int[][] board = new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
//        assertArrayEquals(new int[] {2,3,4,2,4}, test.setTop(board));
//    }

}
