package algorithm.programmers.level2.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 문자열_압축TEST implements TEST {

    private 문자열_압축 test;

    @BeforeEach
    public void setup() {
        test = new 문자열_압축();
    }

    @Test
    public void solutionTest() {
        assertEquals(7, test.solution("aabbaccc"));
        assertEquals(9, test.solution("ababcdcdababcdcd"));
        assertEquals(8, test.solution("abcabcdede"));
        assertEquals(14, test.solution("abcabcabcabcdededededede"));
        assertEquals(17, test.solution("xababcdcdababcdcd"));
        assertEquals(1, test.solution("a"));
        assertEquals(2, test.solution("aaaaa"));
        assertEquals(3, test.solution("aaaaaaaaaa"));
    }

}
