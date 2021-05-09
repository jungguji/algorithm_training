package algorithm.programmers.level1.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 신규_아이디_추천Test {

    @Test
    void solution() {
        신규_아이디_추천 test = new 신규_아이디_추천();
        assertEquals("bat.y.abcdefghi", test.solution("...!@BaT#*..y.abcdefghijklm"));
        assertEquals("z--", test.solution("z-+.^."));
        assertEquals("aaa", test.solution("=.="));
        assertEquals("123_.def", test.solution("123_.def"));
        assertEquals("abcdefghijklmn", test.solution("abcdefghijklmn.p"));
        assertEquals("b.x", test.solution("b=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.x"));
        assertEquals("-_._-", test.solution("-_.~!@#$%^&*()=+[{]}:?,<>/._-"));
        assertEquals("aaaaaaaaaaaaaaa", test.solution("aaaaaaaaaaaaaaaa"));
    }
}