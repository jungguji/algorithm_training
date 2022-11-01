package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 가운데_글자_가져오기TEST {
    private 가운데_글자_가져오기 test;

    @BeforeEach
    public void setup() {
        test = new 가운데_글자_가져오기();
    }

    @Test
    public void solutionTest() {
        assertEquals("c", test.solution("abcde"));
        assertEquals("we", test.solution("qwer"));
    }
}
