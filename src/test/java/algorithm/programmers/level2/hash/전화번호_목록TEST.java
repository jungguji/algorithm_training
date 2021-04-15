package algorithm.programmers.level2.hash;

import algorithm.programmers.level1.practice.TEST;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class 전화번호_목록TEST implements TEST {

    private 전화번호_목록 test;
    
    @BeforeEach
    public void setup() {
        test = new 전화번호_목록();
    }

    @Test
    public void solutionTest() {
        assertFalse(test.solution(new String[] {"119", "97674223", "1195524421"} ));
        assertTrue(test.solution(new String[] {"123","456","789"} ));
        assertFalse(test.solution(new String[] {"12","123","1235","567","88"} ));
    }

}
