package algorithm.programmers.level1.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class K번째_수TEST {

    private K번째_수 test;

    @BeforeEach
    public void setup() {
        test = new K번째_수();
    }

    @Test
    public void solutionTest() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] expecteds = {5, 6, 3};
        int[] actuals = test.solution(array, commands);

        assertArrayEquals(expecteds, actuals);
    }
}
