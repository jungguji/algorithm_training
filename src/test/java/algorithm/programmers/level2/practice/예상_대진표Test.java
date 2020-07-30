package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 예상_대진표Test {

    @Test
    void solution() {
        예상_대진표 test = new 예상_대진표();

        assertEquals(3, test.solution(8, 4, 7));
        assertEquals(4, test.solution(16, 1, 15));
        assertEquals(1, test.solution(8, 2, 1));
        assertEquals(4, test.solution(16, 7, 15));
    }
}