package algorithm.programmers.level1.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class 최대공약수와_최소공배수TEST implements TEST {

    private 최대공약수와_최소공배수 test;

    @BeforeEach
    public void setup() {
        test = new 최대공약수와_최소공배수();
    }

    @Test
    public void solutionTest() {
//        assertArrayEquals(new int[] {3, 12}, test.solution(3, 12));
//        assertArrayEquals(new int[] {1, 10}, test.solution(2, 5));
//        assertArrayEquals(new int[] {1, 15233730}, test.solution(12345, 1234))
        assertArrayEquals(new int[]{1, 15233730}, test.solution(1, 13));
    }

}
