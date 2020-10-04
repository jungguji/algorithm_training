package algorithm.baekjoon.bruteforce.silver;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 문서검색Test {

    private 문서검색 test;

    @BeforeEach
    void setUp() {
        test = new 문서검색();
    }

    @Test
    void solution() {
        assertEquals(2, test.solution("ababababa", "aba"));
        assertEquals(2, test.solution("a a a a a", "a a"));
        assertEquals(1, test.solution("ababc", "abc"));
        assertEquals(1, test.solution("ababaa", "abaa"));
        assertEquals(1, test.solution("aabb", "ab"));
        assertEquals(0, test.solution("aaaaaaaaaaaaaaaaaaaa", "aba"));
        assertEquals(20, test.solution("aaaaaaaaaaaaaaaaaaaa", "a"));
        assertEquals(1, test.solution("yeyeyeyeyeysyeyeyeyseyeyeyes", "yeyeyes"));
        assertEquals(3, test.solution("abb abb abb abbc", "b a"));
    }
}