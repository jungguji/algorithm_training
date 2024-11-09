package algorithm.programmers.level1.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 지폐접기Test {

    @Test
    void solution() {
        지폐접기 지폐접기 = new 지폐접기();
        int solution = 지폐접기.solution(new int[]{30, 15}, new int[]{26, 17});
        assertEquals(1, solution);
    }

    @Test
    void solution1() {
        지폐접기 지폐접기 = new 지폐접기();
        int solution = 지폐접기.solution(new int[]{50, 50}, new int[]{100, 241});
        assertEquals(4, solution);
    }

    @Test
    void solution2() {
        지폐접기 지폐접기 = new 지폐접기();
        int solution = 지폐접기.solution(new int[]{10, 10}, new int[]{2000, 2000});
        assertEquals(16, solution);
    }

    @Test
    void solution3() {
        지폐접기 지폐접기 = new 지폐접기();
        int solution = 지폐접기.solution(new int[]{100, 100}, new int[]{10, 10});
        assertEquals(0, solution);
    }

    @Test
    void solution4() {
        지폐접기 지폐접기 = new 지폐접기();
        int solution = 지폐접기.solution(new int[]{100, 10}, new int[]{2000, 10});
        assertEquals(5, solution);
    }
}