package algorithm.programmers;

import algorithm.programmers.level3.dp.코딩테스트_문제풀기;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 코딩테스트_문제풀기Test {

    @Test
    void solution() {
        코딩테스트_문제풀기 test = new 코딩테스트_문제풀기();
        int solution = test.solution(10, 10, new int[][]{{10, 15, 2, 1, 2}, {20, 20, 3, 3, 4}});
        assertEquals(15, solution);
    }

    @Test
    void solution1() {
        코딩테스트_문제풀기 test = new 코딩테스트_문제풀기();
        int solution = test.solution(0, 0, new int[][]{{0,0,2,1,2},{4,5,3,1,2},{4,11,4,0,2},{10,4,0,4,2}});
        assertEquals(13, solution);
    }
}