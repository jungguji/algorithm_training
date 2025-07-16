package algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 성격유형검사하기Test {

    @Test
    void solution() {
        성격유형검사하기 test = new 성격유형검사하기();
        test.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5,3,2,7,5});
    }
}