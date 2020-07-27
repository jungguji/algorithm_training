package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 점프와_순간_이동Test {

    private 점프와_순간_이동 test;

    @BeforeEach
    void setUp() {
        test = new 점프와_순간_이동();
    }

    @Test
    void solution() {
        assertEquals(2,test.solution(5));
        assertEquals(2,test.solution(6));
        assertEquals(5,test.solution(5000));
        assertEquals(1,test.solution(1));
        assertEquals(12,test.solution(424964289));
        assertEquals(15,test.solution(489465));
    }
}