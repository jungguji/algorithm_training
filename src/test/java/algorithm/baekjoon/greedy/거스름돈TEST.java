package algorithm.baekjoon.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 거스름돈TEST implements TEST {

    private 거스름돈 test;

    @BeforeEach
    public void setup() {
        test = new 거스름돈();
    }

    @Test
    public void solutionTest() {
        assertEquals(4, test.getChangesAmount(380));
        assertEquals(1, test.getChangesAmount(999));
        assertEquals(15, test.getChangesAmount(1));
    }

}
