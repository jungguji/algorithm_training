package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class 대충_만든_자판Test {

    @Test
    void solution() {
        대충_만든_자판 test = new 대충_만든_자판();

        assertArrayEquals(new int[]{9,4}, test.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"}));
        assertArrayEquals(new int[]{-1}, test.solution(new String[]{"AA"}, new String[]{"B"}));
        assertArrayEquals(new int[]{4,6}, test.solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA","BGZ"}));
    }
}