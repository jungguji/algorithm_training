package algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 파괴되지않은건물Test {

    @Test
    void solution() {
        파괴되지않은건물 test = new 파괴되지않은건물();

        int solution = test.solution(new int[][]{{5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}}, new int[][]{{1, 0, 0, 3, 4, 4}, {1, 2, 0, 2, 3, 2}, {2, 1, 0, 3, 1, 2}, {1, 0, 1, 3, 3, 1}});
        assertEquals(10, solution);
    }

    @Test
    void solution1() {
        파괴되지않은건물 test = new 파괴되지않은건물();

        int solution = test.solution(new int[][]{{1,2,3}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}}, new int[][]{{1, 0, 0, 3, 4, 4}, {1, 2, 0, 2, 3, 2}, {2, 1, 0, 3, 1, 2}, {1, 0, 1, 3, 3, 1}});
        assertEquals(10, solution);
    }
}