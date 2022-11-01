package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 문자열_내림차수능로_배치하기TEST implements TEST {

    private 문자열_내림차수능로_배치하기 test;

    @BeforeEach
    public void setup() {
        test = new 문자열_내림차수능로_배치하기();
    }

    @Test
    public void solutionTest() {
        assertEquals("gfedcbZ", test.solution("Zbcdefg"));
    }

}
