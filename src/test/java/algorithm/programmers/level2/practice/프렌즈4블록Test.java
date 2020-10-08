package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 프렌즈4블록Test {

    private 프렌즈4블록 test;

    @BeforeEach
    void setUp() {
        test = new 프렌즈4블록();
    }

    @Test
    void solution() {
        assertEquals(14, test.solution(4,5, new String[] {"CCBDE", "AAADE", "AAABF", "CCBBF"}));
        assertEquals(15, test.solution(6,6, new String[] {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"}));
        assertEquals(14, test.solution(4,5, new String[] {"AAAAA","AUUUA","AUUAA","AAAAA"}));
        assertEquals(4, test.solution(2,2, new String[] {"AA","AA"}));
        assertEquals(0, test.solution(2,2, new String[] {"AA","AB"}));
        assertEquals(4, test.solution(3,2, new String[] {"AA","AA", "AB"}));
        assertEquals(8, test.solution(4,2, new String[] {"CC","AA", "AA", "CC"}));
        assertEquals(12, test.solution(6,2, new String[] {"DD", "CC", "AA", "AA", "CC", "DD"}));
        assertEquals(8, test.solution(8,2, new String[] {"FF", "AA", "CC", "AA", "AA", "CC", "DD", "FF"}));
        assertEquals(8, test.solution(6,2, new String[] {"AA", "AA", "CC", "AA", "AA", "DD"}));
        assertEquals(8, test.solution(4,4, new String[] {"ABCD", "BACE", "BCDD", "BCDD"}));
        assertEquals(27, test.solution(8,9, new String[] {"ABCDADFDA", "ABDFQWERF", "WKDNFNRIT", "AKAKWODCJ", "AKAKWODCJ", "KKKKKKKKK", "KKKKKKKKK", "KKKKKKKKK"}));
        assertEquals(15, test.solution(4,5, new String[] {"AAAAA", "AAAAU", "AAAUU", "UUUUU"}));
        assertEquals(24, test.solution(5,6, new String[] {"AAAAAA", "BBAATB", "BBAATB", "JJJTAA", "JJJTAA"}));
        assertEquals(32, test.solution(6,6, new String[] {"AABBEE", "AAAEEE", "VAAEEV", "AABBEE", "AACCEE", "VVCCEE"}));
    }

    @Test
    void convertStringArrayToCharArray() {
        assertArrayEquals(new char[][] {{'C','C','B','D','E'}, {'A','A','A','D','E'}, {'A','A','A','B','F'}, {'C','C','B','B','F'}}, test.convertStringArrayToCharArray(4, 5, new String[] {"CCBDE", "AAADE", "AAABF", "CCBBF"}));
    }

    @Test
    void toLowerCase() {
        assertEquals('a', test.toLowerCase('a'));
        assertEquals('a', test.toLowerCase('A'));
    }

    @Test
    void box() {
        //given
        char[][] given = test.convertStringArrayToCharArray(4,5, new String[] {"CCBDE", "AAADE", "AAABF", "CCBBF"});

        assertFalse(test.box(given));
    }
}