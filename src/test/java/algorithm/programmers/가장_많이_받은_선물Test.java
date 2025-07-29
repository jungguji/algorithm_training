package algorithm.programmers;

import algorithm.programmers.level1.avatar.가장_많이_받은_선물;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 가장_많이_받은_선물Test {

    @Test
    void solution() {
        가장_많이_받은_선물 test = new 가장_많이_받은_선물();
        int solution = test.solution(new String[]{"muzi", "ryan", "frodo", "neo"}, new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"});
        assertEquals(2, solution);
    }
}