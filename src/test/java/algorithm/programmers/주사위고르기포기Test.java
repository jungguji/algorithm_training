package algorithm.programmers;

import org.junit.jupiter.api.Test;

class 주사위고르기포기Test {

    @Test
    void solution() {
        주사위고르기_포기 test = new 주사위고르기_포기();
        test.solution(new int[][]{{1, 2, 3, 4, 5, 6}, {3, 3, 3, 3, 4, 4}, {1, 3, 3, 4, 4, 4}, {1, 1, 4, 4, 5, 5}});
    }
}