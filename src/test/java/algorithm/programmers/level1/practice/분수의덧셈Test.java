package algorithm.programmers.level1.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 분수의덧셈Test {

    @Test
    void euclidean() {
        분수의덧셈 분수의덧셈 = new 분수의덧셈();
        int[] solution = 분수의덧셈.solution(1, 2, 3, 4);

        assertArrayEquals(new int[]{5,4}, solution);
    }

    @Test
    void euclidean1() {
        분수의덧셈 분수의덧셈 = new 분수의덧셈();
        int[] solution = 분수의덧셈.solution(9, 2, 1, 3);

        assertArrayEquals(new int[]{29,6}, solution);
    }
}