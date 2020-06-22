package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 올바른_괄호Test {

    private 올바른_괄호 test;

    @BeforeEach
    void setUp() {
        test = new 올바른_괄호();
    }

    @Test
    void solution() {
        assertTrue(test.solution("()()"));
        assertTrue(test.solution("(())()"));
        assertFalse(test.solution(")()("));
        assertFalse(test.solution("(()("));
        assertFalse(test.solution("()())"));
        assertTrue(test.solution("(((((((((())))))))))"));
        assertFalse(test.solution("((((()(((())))))))))"));
    }
}