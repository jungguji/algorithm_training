package algorithm.baekjoon.class2.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 최대공약수와_최소공배수Test {

    private 최대공약수와_최소공배수 test;

    @BeforeEach
    void setUp() {
        test = new 최대공약수와_최소공배수();
    }

    @Test
    void getGcdAndLcm() {
        assertArrayEquals(new int[]{6, 72}, test.getGcdAndLcm(new int[]{24, 18}));
        assertArrayEquals(new int[]{3, 12}, test.getGcdAndLcm(new int[]{3, 12}));
        assertArrayEquals(new int[]{1, 10}, test.getGcdAndLcm(new int[]{2, 5}));
        assertArrayEquals(new int[]{1, 15233730}, test.getGcdAndLcm(new int[]{12345, 1234}));
        assertArrayEquals(new int[]{3, 3}, test.getGcdAndLcm(new int[]{3, 3}));
        assertArrayEquals(new int[]{11, 66}, test.getGcdAndLcm(new int[]{22, 33}));
        assertArrayEquals(new int[]{3, 6}, test.getGcdAndLcm(new int[]{3, 6}));
    }
}