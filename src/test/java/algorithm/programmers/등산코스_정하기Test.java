package algorithm.programmers;

import algorithm.programmers.level3.graph.dijkstra.등산코스_정하기;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 등산코스_정하기Test {

    @Test
    void solution() {
        등산코스_정하기 test = new 등산코스_정하기();
        int[][] paths = {{1, 2, 3}, {2, 3, 5}, {2, 4, 2}, {2, 5, 4}, {3, 4, 4}, {4, 5, 3}, {4, 6, 1}, {5, 6, 1}};

        int[] solution = test.solution(6, paths, new int[]{1, 3}, new int[]{5});
        assertArrayEquals(new int[]{5,3}, solution);
    }

    @Test
    void solution1() {
        등산코스_정하기 test = new 등산코스_정하기();
        int[][] paths = {{1, 4, 4}, {1, 6, 1}, {1, 7, 3}, {2, 5, 2}, {3, 7, 4}, {5, 6, 6}};

        int[] solution = test.solution(7, paths, new int[]{1}, new int[]{2,3,4});
        assertArrayEquals(new int[]{3,4}, solution);
    }

    @Test
    void solution2() {
        등산코스_정하기 test = new 등산코스_정하기();
        int[][] paths = {{1, 2, 5}, {1, 4, 1}, {2, 3, 1}, {2, 6, 7}, {4, 5, 1}, {5, 6, 1}, {6, 7, 1}};

        int[] solution = test.solution(7, paths, new int[]{3,7}, new int[]{1,5});
        assertArrayEquals(new int[]{5,1}, solution);
    }

    @Test
    void solution3() {
        등산코스_정하기 test = new 등산코스_정하기();
        int[][] paths = {{1, 3, 10}, {1, 4, 20}, {2, 3, 4}, {2, 4, 6}, {3, 5, 20}, {4, 5, 6}};

        int[] solution = test.solution(5, paths, new int[]{1, 2}, new int[]{5});
        assertArrayEquals(new int[]{5,6}, solution);
    }
}