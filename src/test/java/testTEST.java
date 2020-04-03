import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class testTEST implements TEST {

    private test test;
    @BeforeEach
    public void setup() {
        test = new test();
    }

    @Test
    public void solutionTest() {
        assertEquals("aelpp", test.vvv("apple"));
        assertEquals("abexzzz", test.vvv("azzbexz"));
        assertEquals("abexzzz", test.vvv("azebzxz"));
        assertEquals("abexzzz", test.vvv("zeabzxz"));
        assertEquals("abexzzz", test.vvv("zaezxzb"));
        assertEquals("abexzzz", test.vvv("zebzxza"));
    }

}
