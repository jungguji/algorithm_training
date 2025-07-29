package algorithm.programmers.level1.avatar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 택배_상자_거내기Test {

    @Test
    void solution() {
        택배_상자_거내기 test = new 택배_상자_거내기();
        int solution = test.solution(22, 6, 8);
        assertEquals(3, solution);
    }

    @Test
    void solution1() {
        택배_상자_거내기 test = new 택배_상자_거내기();
        int solution = test.solution(13, 3, 6);
        assertEquals(4, solution);
    }
}