package algorithm.programmers.level1.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 서울에서_김서방_찾기TEST implements TEST {

    private 서울에서_김서방_찾기 test;

    @BeforeEach
    public void setup() {
        test = new 서울에서_김서방_찾기();
    }

    @Test
    public void solutionTest() {
        assertEquals("김서방은 1에 있다", test.solution(new String[]{"Jane", "Kim"}));
        assertEquals("김서방은 0에 있다", test.solution(new String[]{"Kim", "Jane"}));
    }


}
