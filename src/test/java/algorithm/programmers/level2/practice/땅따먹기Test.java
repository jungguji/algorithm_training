package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 땅따먹기Test {

    private 땅따먹기 test;

    @BeforeEach
    void setUp() {
        test = new 땅따먹기();
    }

    @Test
    void solution() {
        assertEquals(16, test.solution(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}}));
        assertEquals(20, test.solution(new int[][]{{4, 3, 2, 1}, {2, 2, 2, 1}, {6, 6, 6, 4}, {8, 7, 6, 5}}));
        assertEquals(115, test.solution(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}, {100, 0, 9, 8}}));
        assertEquals(33, test.solution(new int[][]{{1, 2, 3, 5}, {10, 11, 12, 11}, {16, 15, 13, 13}}));
        assertEquals(409, test.solution(new int[][]{{1, 100, 15, 3}, {1, 2, 3, 4}, {100, 99, 98, 97}, {97, 98, 99, 100}, {4, 3, 2, 1}, {100, 100, 100, 100}, {1, 1, 1, 1}}));
        assertEquals(16, test.solution(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 9}, {4, 3, 2, 1}}));
        assertEquals(125, test.solution(new int[][]{{9, 5, 2, 3}, {9, 8, 6, 7}, {8, 9, 7, 1}, {100, 9, 8, 1}}));
        assertEquals(20, test.solution(new int[][]{{4, 3, 2, 1}, {2, 2, 2, 1}, {6, 6, 6, 4}, {8, 7, 6, 5}}));
    }
}