package algorithm.baekjoon.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 단어의_개수TEST implements TEST {

    private 단어의_개수 test;
    
    @BeforeEach
    public void setup() {
        test = new 단어의_개수();
    }

    @SuppressWarnings("static-access")
    @Test
    public void solutionTest() {
//        assertEquals(6, test.solution("The Curious Case of Benjamin Button"));
//        assertEquals(3, test.solution(" Mazatneunde Wae Teullyeoyo"));
//        assertEquals(2, test.solution("Teullinika Teullyeotzi "));
//        assertEquals(7, test.solution(" a b c d e f g "));
        assertEquals(0, test.solution(" "));
    }

}
