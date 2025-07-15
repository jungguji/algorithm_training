package algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 사라지는발판Test {

    @Test
    void solution() {
        사라지는발판 test = new 사라지는발판();
        int solution = test.solution(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}, new int[]{1, 0}, new int[]{1, 2});
        assertEquals(5, solution);
    }
}