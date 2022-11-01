package algorithm.baekjoon.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Question11399TEST {
    private Question11399 test;

    @BeforeEach
    public void setup() {
        test = new Question11399();
    }

    @Test
    public void solutionTest() {
        assertEquals(32, test.solution(5, new int[]{3, 1, 4, 3, 2}));
    }
}
