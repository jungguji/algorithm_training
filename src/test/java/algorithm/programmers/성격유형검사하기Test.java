package algorithm.programmers;

import algorithm.programmers.level1.avatar.성격유형검사하기;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 성격유형검사하기Test {

    @Test
    void solution() {
        성격유형검사하기 test = new 성격유형검사하기();
        String solution = test.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
        assertEquals("TCMA", solution);
    }

    @Test
    void solution1() {
        성격유형검사하기 test = new 성격유형검사하기();
        String solution = test.solution(new String[]{"TR", "RT", "TR"}, new int[]{7,1,3});
        assertEquals("RCJA", solution);
    }
}