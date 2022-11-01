package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class x만큼_간격이_있는_n개의_숫자TEST implements TEST {

    private x만큼_간격이_있는_n개의_숫자 test;

    @BeforeEach
    public void setup() {
        test = new x만큼_간격이_있는_n개의_숫자();
    }

    @Test
    public void solutionTest() {
        assertArrayEquals(new long[]{2, 4, 6, 8, 10}, test.solution(2, 5));
        assertArrayEquals(new long[]{4, 8, 12}, test.solution(4, 3));
        assertArrayEquals(new long[]{-4, -8}, test.solution(-4, 2));
    }

}
