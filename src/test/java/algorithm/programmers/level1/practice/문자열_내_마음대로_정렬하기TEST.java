package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 문자열_내_마음대로_정렬하기TEST implements TEST {

    private 문자열_내_마음대로_정렬하기 test;
    
    @BeforeEach
    public void setup() {
        test = new 문자열_내_마음대로_정렬하기();
    }

    @Test
    public void solutionTest() {
        assertArrayEquals(new String[] {"car", "bed", "sun"}, test.solution(new String[] {"sun", "bed", "car"}, 1));
        assertArrayEquals(new String[] {"abcd", "abce", "cdx"}, test.solution(new String[] {"abce", "abcd", "cdx"}, 2));
        assertArrayEquals(new String[] {"abcd", "abce", "cdx"}, test.solution(new String[] {"abce", "cdx", "abcd"}, 2));
    }

}
