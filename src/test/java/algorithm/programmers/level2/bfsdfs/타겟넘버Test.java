package algorithm.programmers.level2.bfsdfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 타겟넘버Test {

    private 타겟넘버 test;

    @BeforeEach
    void setUp() {
        test = new 타겟넘버();
    }

    @Test
    void solution() {
        assertEquals(5, test.solution(new int[] {1,1,1,1,1}, 3));
        assertEquals(3, test.solution(new int[] {2,3,5,7,9}, 2));
        assertEquals(1, test.solution(new int[] {1}, 1));
        assertEquals(5, test.solution(new int[] {6,2,3,6,7,1}, 7));
    }
}