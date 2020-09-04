package algorithm.baekjoon.class2.stackqueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 괄호Test {

    private 괄호 test;

    @BeforeEach
    void setUp() {
        test = new 괄호();
    }

    @Test
    void isVPS() {
        assertFalse(test.isVPS("(())())"));
        assertFalse(test.isVPS("(((()())()"));
        assertTrue(test.isVPS("(()())((()))"));
        assertFalse(test.isVPS("((()()(()))(((())))()"));
        assertTrue(test.isVPS("()()()()(()()())()"));
        assertFalse(test.isVPS("(()((())()("));
        assertFalse(test.isVPS("(("));
        assertFalse(test.isVPS("))"));
        assertFalse(test.isVPS("())(()"));
        assertTrue(test.isVPS("()()"));
        assertTrue(test.isVPS("(())()"));
        assertFalse(test.isVPS(")()("));
        assertFalse(test.isVPS("(()("));
        assertFalse(test.isVPS("()())"));
        assertTrue(test.isVPS("(((((((((())))))))))"));
        assertFalse(test.isVPS("((((()(((())))))))))"));
        assertFalse(test.isVPS(")("));
    }
}