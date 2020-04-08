package algorithm.programmers.level1.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 비밀지도TEST implements TEST {

    private 비밀지도 test;
    
    @BeforeEach
    public void setup() {
        test = new 비밀지도();
    }

    @Test
    public void solutionTest() {
        int n = 5;
        int[] arr1 = new int[] {9,20,28,18,11};
        int[] arr2 = new int[] {30,1,21,17,28};
        
        test.solution(n, arr1, arr2);
        int n2 = 6;
        int[] arr3 = new int[] {46, 33, 33 ,22, 31, 50};
        int[] arr4 = new int[] {27 ,56, 19, 14, 14, 10};
        
        test.solution(n2, arr3, arr4);
    }

}
