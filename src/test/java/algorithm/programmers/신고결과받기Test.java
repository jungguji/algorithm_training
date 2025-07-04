package algorithm.programmers;

import algorithm.programmers.level1.avatar.신고결과받기;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 신고결과받기Test {

    private final 신고결과받기 test = new 신고결과받기();

    @Test
    void solution() {
        assertArrayEquals(new int[]{2, 1, 1, 0}, test.solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2));
        assertArrayEquals(new int[]{0, 0}, test.solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3));
    }
}