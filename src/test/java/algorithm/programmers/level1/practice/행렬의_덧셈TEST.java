package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 행렬의_덧셈TEST implements TEST {

    private 행렬의_덧셈 test;
    @BeforeEach
    public void setup() {
        test = new 행렬의_덧셈();
    }

    @Test
    public void solutionTest() {
        assertArrayEquals(new int[][] {{4,6}, {7,9}}, test.solution(new int[][] {{1,2}, {2,3}}, new int[][] {{3,4}, {5,6}}));
        assertArrayEquals(new int[][] {{4}, {6}}, test.solution(new int[][] {{1},{2}}, new int[][] {{3},{4}}));
    }

}
