package algorithm.programmers;

import algorithm.programmers.level2.bfsdfs.두큐의합같게하기;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 두큐의합같게하기Test {

    @Test
    void solution() {
        두큐의합같게하기 test = new 두큐의합같게하기();
        int solution = test.solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1});

        assertEquals(2, solution);
    }

    @Test
    void solution1() {
        두큐의합같게하기 test = new 두큐의합같게하기();
        int solution = test.solution(new int[]{1,2,1,2}, new int[]{1,10,1,2});

        assertEquals(7, solution);
    }

    @Test
    void solution2() {
        두큐의합같게하기 test = new 두큐의합같게하기();
        int solution = test.solution(new int[]{1,1}, new int[]{1,5});

        assertEquals(-1, solution);
    }
}