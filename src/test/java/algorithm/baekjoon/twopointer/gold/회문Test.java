package algorithm.baekjoon.twopointer.gold;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 회문Test {

    @Test
    public void teset1() {
        int actual = 회문.solution("abba");
        assertEquals(0, actual);
    }

    @Test
    public void teset2() {
        int actual = 회문.solution("summuus");
        assertEquals(1, actual);
    }

    @Test
    public void teset3() {
        int actual = 회문.solution("xabba");
        assertEquals(1, actual);
    }

    @Test
    public void teset4() {
        int actual = 회문.solution("xabbay");
        assertEquals(2, actual);
    }

    @Test
    public void teset5() {
        int actual = 회문.solution("comcom");
        assertEquals(2, actual);
    }

    @Test
    public void teset6() {
        int actual = 회문.solution("comwwmoc");
        assertEquals(0, actual);
    }

    @Test
    public void teset7() {
        int actual = 회문.solution("comwwtmoc");
        assertEquals(1, actual);
    }

    @Test
    public void teset8() {
        int actual = 회문.solution("abxxbxa");
        assertEquals(1, actual);
    }
}