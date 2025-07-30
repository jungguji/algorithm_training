package algorithm.programmers;

import algorithm.programmers.level2.avatar.도넛과_막대_그래프;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 도넛과_막대_그래프Test {

    @Test
    void solution() {
        도넛과_막대_그래프 test = new 도넛과_막대_그래프();
        int[] solution = test.solution(new int[][]{{2, 3}, {4, 3}, {1, 1}, {2, 1}});
        assertArrayEquals(new int[]{2, 1, 1, 0}, solution);
    }

    @Test
    void solution1() {
        도넛과_막대_그래프 test = new 도넛과_막대_그래프();
        int[] solution = test.solution(new int[][]{{4, 11}, {1, 12}, {8, 3}, {12, 7}, {4, 2}, {7, 11}, {4, 8}, {9, 6}, {10, 11}, {6, 10}, {3, 5}, {11, 1}, {5, 3}, {11, 9}, {3, 8}});
        assertArrayEquals(new int[]{4, 0, 1, 2}, solution);
    }
}