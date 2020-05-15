package algorithm.programmers.level2.hash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 위장TEST implements TEST {

    private 위장 test;
    
    @BeforeEach
    public void setup() {
        test = new 위장();
    }

    @Test
    public void solutionTest() {
        assertEquals(5, test.solution(new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
        assertEquals(3, test.solution(new String[][] {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"green_turban", "face"}}));
    }

}
