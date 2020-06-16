package algorithm.programmers.level2.practice;

import algorithm.programmers.level1.practice.TEST;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 스킬트리TEST implements TEST {

    private 스킬트리 test;
    
    @BeforeEach
    public void setup() {
        test = new 스킬트리();
    }

    @Test
    public void solutionTest() {
        assertEquals(3, test.solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA", "ASF", "BDF","CEFD"}));
        assertEquals(4, test.solution("C", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));
        assertEquals(2, test.solution("CBD", new String[] {"C", "D", "CB", "BDA"}));
        assertEquals(2, test.solution("AC", new String[] {"ABC", "CA", "ATEW", "SFCQTA"}));
        assertEquals(2, test.solution("ACHQ", new String[] {"TWER", "FGCHQEA", "ATEW", "SFCQTA"}));
        assertEquals(4, test.solution("CBDK", new String[] {"CB", "CXYB", "BD", "AECD", "ABC", "AEX", "CDB", "CBKD", "IJCB", "LMDK"}));
    }
    
    @Test
    public void solutionTest2() {
//        assertEquals("BCD CBD CB BD ", test.tqtqtq("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));
//        assertEquals("C C C ", test.tqtqtq("C", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));
//        assertEquals("C D CB BD ", test.tqtqtq("CBD", new String[] {"C", "D", "CB", "BDA"}));
//        assertEquals("AC CA A CA ", test.tqtqtq("AC", new String[] {"ABC", "CA", "ATEW", "SFCQTA"}));
    }

}
