package algorithm.programmers.level1.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 음양_더하기Test {

    @Test
    void solution() {
        음양_더하기 test = new 음양_더하기();
        assertEquals(9, test.solution(new int[]{4,7,12}, new boolean[]{true, false, true}));
        assertEquals(0, test.solution(new int[]{1,2,3}, new boolean[]{false, false, true}));
    }
}