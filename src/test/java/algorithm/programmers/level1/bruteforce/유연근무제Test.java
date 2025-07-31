package algorithm.programmers.level1.bruteforce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 유연근무제Test {

    @Test
    void solution() {
        유연근무제 test = new 유연근무제();
        int solution = test.solution(new int[]{700, 800, 1100}, new int[][]{{710, 2359, 1050, 700, 650, 631, 659}, {800, 801, 805, 800, 759, 810, 809}, {1105, 1001, 1002, 600, 1059, 1001, 1100}}, 5);
        assertEquals(3, solution);
    }
}