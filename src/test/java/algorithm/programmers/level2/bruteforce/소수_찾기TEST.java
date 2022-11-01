package algorithm.programmers.level2.bruteforce;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 소수_찾기TEST implements TEST {

    private 소수_찾기 test;

    @BeforeEach
    public void setup() {
        test = new 소수_찾기();
    }

    @Test
    public void solutionTest() {
        assertEquals(3, test.solution("17"));
        assertEquals(2, test.solution("011"));
        assertEquals(1, test.solution("2"));
        assertEquals(12, test.solution("7843"));
        assertEquals(0, test.solution("9999999"));
        assertEquals(1336, test.solution("1276543"));
    }

}
