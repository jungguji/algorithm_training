package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 괄호_변환Test {

    private 괄호_변환 test;

    @BeforeEach
    void setUp() {
        test = new 괄호_변환();
    }

    @Test
    void solution() {
        assertEquals("(()())()", test.solution("(()())()"));
        assertEquals("()", test.solution(")("));
        assertEquals("()(())()", test.solution("()))((()"));
        assertEquals("(((())))", test.solution(")()()()("));
        assertEquals("()()((()))", test.solution("))()))(((("));
        assertEquals("()", test.solution("()"));
        assertEquals("()()()()()()((()))", test.solution("()()()()()()((()))"));
        assertEquals("((((())())))()(())", test.solution("((((())()))))))((("));
        assertEquals("(((()())())())((()))", test.solution("))))((((((()())()))("));
    }
}