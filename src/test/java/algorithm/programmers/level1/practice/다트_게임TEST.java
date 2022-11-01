package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 다트_게임TEST implements TEST {

    private 다트_게임 test;

    @BeforeEach
    public void setup() {
        test = new 다트_게임();
    }

    @Test
    public void solutionTest() {
        assertEquals(37, test.solution("1S2D*3T"));
        assertEquals(9, test.solution("1D2S#10S"));
        assertEquals(3, test.solution("1D2S0T"));
        assertEquals(23, test.solution("1S*2T*3S"));
        assertEquals(5, test.solution("1D#2S*3S"));
        assertEquals(-4, test.solution("1T2D3D#"));
        assertEquals(59, test.solution("1D2S3T*"));
    }

}
