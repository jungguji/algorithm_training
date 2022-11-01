package algorithm.programmers.level2.bfsdfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class 카카오_프렌즈_컬러링북Test {

    private 카카오_프렌즈_컬러링북 test;

    @BeforeEach
    public void setup() {
        test = new 카카오_프렌즈_컬러링북();
    }

    @Test
    void solution() {
        int[][] picture = new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        assertArrayEquals(new int[]{4, 5}, test.solution(6, 4, picture));

        int[][] picture1 = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        assertArrayEquals(new int[]{0, 0}, test.solution(5, 5, picture1));

        int[][] picture2 = new int[][]{{1, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 1}};
        assertArrayEquals(new int[]{3, 1}, test.solution(5, 5, picture2));

        int[][] picture3 = new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
        assertArrayEquals(new int[]{1, 25}, test.solution(5, 5, picture3));

        int[][] picture4 = new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 100, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
        assertArrayEquals(new int[]{2, 24}, test.solution(5, 5, picture4));

        int[][] picture5 = new int[][]{{1, 1, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}};
        assertArrayEquals(new int[]{2, 6}, test.solution(6, 4, picture5));

        int[][] picture6 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0}, {0, 1, 1, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 1, 1, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {0, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 0}, {0, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 0}, {0, 0, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 0, 0}, {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}};
        assertArrayEquals(new int[]{12, 120}, test.solution(13, 16, picture6));
    }
}