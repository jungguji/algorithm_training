package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 뉴스_클러스터링Test {

    private 뉴스_클러스터링 test;

    @BeforeEach
    void setUp() {
        test = new 뉴스_클러스터링();
    }

    @Test
    void solution() {
//        assertEquals(16384, test.solution("FRANCE", "french"));
//        assertEquals(65536, test.solution("handshake", "shake hands"));
//        assertEquals(65536, test.solution("shake hands", "handshake"));
        assertEquals(43690, test.solution("aa1+aa2", "AAAA12"));
//        assertEquals(43690, test.solution("AAAA12", "aa1+aa2"));
//        assertEquals(65536, test.solution("E=M*C^2", "e=m*c^2"));
//        assertEquals(21845, test.solution("abcd", "ab"));
    }
}