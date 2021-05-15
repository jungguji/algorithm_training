package algorithm.programmers.level1.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 약수의_개수와_덧셈Test {

    @Test
    void solution() {
        약수의_개수와_덧셈 test = new 약수의_개수와_덧셈();
        assertEquals(43, test.solution(13, 17));
        assertEquals(52, test.solution(24, 27));
    }
}