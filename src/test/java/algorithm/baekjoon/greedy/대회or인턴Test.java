package algorithm.baekjoon.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 대회or인턴Test {

    private 대회or인턴 test;

    @BeforeEach
    void setUp() {
        test = new 대회or인턴();
    }

    @Test
    public void testGetMaxTeamCount() {

        assertEquals(2, test.getMaxTeamCount(6, 3, 2));
        assertEquals(5, test.getMaxTeamCount(10, 9, 4));
        assertEquals(0, test.getMaxTeamCount(10, 1, 11));
        assertEquals(0, test.getMaxTeamCount(0, 0, 0));
        assertEquals(0, test.getMaxTeamCount(1, 0, 0));
        assertEquals(50, test.getMaxTeamCount(100, 100, 20));
        assertEquals(0, test.getMaxTeamCount(100, 0, 0));
        assertEquals(0, test.getMaxTeamCount(2, 1, 1));
        assertEquals(0, test.getMaxTeamCount(2, 0, 0));
    }
}