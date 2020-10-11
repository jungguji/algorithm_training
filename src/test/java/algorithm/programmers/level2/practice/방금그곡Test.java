package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class 방금그곡Test {

    private 방금그곡 test;

    @BeforeEach
    void setUp() {
        test = new 방금그곡();
    }

    @Test
    void solution() throws ParseException {
        assertEquals("HELLO", test.solution("ABCDEFG", new String[] {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"}));
        assertEquals("FOO", test.solution("CC#BCC#BCC#BCC#B", new String[] {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"}));
        assertEquals("WORLD", test.solution("ABC", new String[] {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"}));
        assertEquals("(None)", test.solution("CDEFGAC", new String[] {"12:00,12:06,HELLO,CDEFGA"}));
        assertEquals("FOO", test.solution("CCB", new String[] {"03:00,03:10,FOO,CCB#CCB", "04:00,04:08,BAR,ABC"}));
    }
}