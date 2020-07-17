package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadenCaseTest {

    private JadenCase test;

    @BeforeEach
    void setUp() {
        test = new JadenCase();
    }

    @Test
    void solution() {
        assertEquals("3people Unfollowed Me", test.solution("3people unFollowed me"));
        assertEquals("For The Last Week", test.solution("for the last week"));
        assertEquals("A  Sdf Fft", test.solution("A  sdf fFt"));
        assertEquals(" A  Sdf Fft ", test.solution(" A  sdf fFt "));
    }
}