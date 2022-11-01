package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 단체사진_찍기Test {

    private 단체사진_찍기 test;

    @BeforeEach
    void setUp() {
        test = new 단체사진_찍기();
    }

    @Test
    void solution() {
        assertEquals(3648, test.solution(2, new String[]{"N~F=0", "R~T>2"}));
        assertEquals(0, test.solution(2, new String[]{"M~C<2", "C~M>1"}));
    }
}