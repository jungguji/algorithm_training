package algorithm.baekjoon.class2.stackqueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 균형잡힌_세상Test {

    private 균형잡힌_세상 test;

    @BeforeEach
    void setUp() {
        test = new 균형잡힌_세상();
    }

    @Test
    void solution() {
        assertTrue(test.solution("So when I die (the [first] I will see in (heaven) is a score list)."));
        assertTrue(test.solution("[ first in ] ( first out )."));
        assertFalse(test.solution("Half Moon tonight (At least it is better than no Moon at all]."));
        assertFalse(test.solution("A rope may form )( a trail in a maze."));
        assertFalse(test.solution("Help( I[m being held prisoner in a fortune cookie factory)]."));
        assertTrue(test.solution("([ (([( [ ] ) ( ) (( ))] )) ])."));
        assertTrue(test.solution(" ."));
        assertTrue(test.solution("()()"));
        assertTrue(test.solution("()()"));
        assertTrue(test.solution("(())()"));
        assertFalse(test.solution(")()("));
        assertFalse(test.solution("(()("));
        assertFalse(test.solution("()())"));
        assertTrue(test.solution("(((((((((())))))))))"));
        assertFalse(test.solution("((((()(((())))))))))"));
        assertFalse(test.solution("(])"));
    }
}