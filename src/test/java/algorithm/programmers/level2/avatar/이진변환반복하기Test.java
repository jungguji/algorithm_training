package algorithm.programmers.level2.avatar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 이진변환반복하기Test {

    @Test
    void solution() {
        이진변환반복하기 test = new 이진변환반복하기();
        assertArrayEquals(new int[]{3, 8}, test.solution("110010101001"));
    }

    @Test
    void solution1() {
        이진변환반복하기 test = new 이진변환반복하기();
        assertArrayEquals(new int[]{4, 1}, test.solution("1111111"));
    }

    @Test
    void solution2() {
        이진변환반복하기 test = new 이진변환반복하기();
        assertArrayEquals(new int[]{3, 3}, test.solution("01110"));
    }
}