package algorithm.programmers.level2.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 조이스틱TEST implements TEST {

    private 조이스틱 test;

    @BeforeEach
    public void setup() {
        test = new 조이스틱();
    }

    @Test
    public void solutionTest() {
        assertEquals(4, test.solution("AAABAA"));
        assertEquals(56, test.solution("JEROEN"));
        assertEquals(23, test.solution("JAN"));
        assertEquals(48, test.solution("CANAAAAANAN"));
        assertEquals(8, test.solution("BBBAAB"));
        assertEquals(56, test.solution("AAAAACANAAAAANANAAAAAA"));
        assertEquals(3, test.solution("BBAAAAA"));
        assertEquals(41, test.solution("JJAJAAAAAAAAAJ"));
        assertEquals(21, test.solution("AJAJAA"));
        assertEquals(7, test.solution("BBAABAA"));
        assertEquals(6, test.solution("BBABA"));
        assertEquals(10, test.solution("BBAABBB"));
        assertEquals(7, test.solution("BBAABAAAA"));
        assertEquals(10, test.solution("BBAABAAAAB"));
        assertEquals(6, test.solution("ABAAAAAAABA"));
        assertEquals(2, test.solution("AAB"));
        assertEquals(11, test.solution("AABAAAAAAABBB"));
        assertEquals(5, test.solution("ZZZ"));
        assertEquals(10, test.solution("BBBBAAAAAB"));
        assertEquals(12, test.solution("BBBBAAAABA"));
        assertEquals(10, test.solution("ABABAAAAAAABA"));
        assertEquals(18, test.solution("BBBBBBBABB"));
        assertEquals(5, test.solution("AZAAAZ"));
        assertEquals(3, test.solution("AC"));
        assertEquals(3, test.solution("BBAAAAA"));
        assertEquals(17, test.solution("ABAAABBBBBBB"));
    }

}
