package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 시저암호TEST implements TEST {
    
    private 시저암호 test;
    
    @BeforeEach
    public void setup() {
        test = new 시저암호();
    }
    
    @Test
    public void solutionTest() {
        assertEquals("BC", test.solution("AB", 1));
        assertEquals("a", test.solution("z", 1));
        assertEquals("e F d", test.solution("a B z", 4));
    }

}
