package algorithm.baekjoon.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DNATest {

    private DNA test;

    @BeforeEach
    void setUp() {
        test = new DNA();
    }

    @Test
    public void solutionTest() {
        String[] array = new String[]{
                "TATGATAC"
                , "TAAGCTAC"
                , "AAAGATCC"
                , "TGAGATAC"
                , "TAAGATGT"
        };

        assertArrayEquals(new String[]{"TAAGATAC", "7"}, test.solution(5, 8, array));

        array = new String[]{
                "ACGTACGTAC"
                , "CCGTACGTAG"
                , "GCGTACGTAT"
                , "TCGTACGTAA"
        };

        assertArrayEquals(new String[]{"ACGTACGTAA", "6"}, test.solution(4, 10, array));

        array = new String[]{
                "ATGTTACCAT"
                , "AAGTTACGAT"
                , "AACAAAGCAA"
                , "AAGTTACCTT"
                , "AAGTTACCAA"
                , "TACTTACCAA"
        };

        assertArrayEquals(new String[]{"AAGTTACCAA", "12"}, test.solution(6, 10, array));
        array = new String[]{
                "AAA"
                , "AAA"
                , "AAA"
                , "BBB"
                , "BBB"
                , "BBB"
        };

        assertArrayEquals(new String[]{"AAA", "9"}, test.solution(6, 3, array));
    }
}