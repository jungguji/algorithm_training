package algorithm.baekjoon.class2.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 소수_구하기Test {

    private 소수_구하기 test;

    @BeforeEach
    void setUp() {
        test = new 소수_구하기();
    }

    @Test
    void solution() {
        String expected1 = "3\n5\n7\n11\n13\n";
        assertEquals(expected1, test.solution(3, 16));
        assertEquals("2\n3\n5\n7\n11\n13\n17\n19\n23\n29\n31\n37\n41\n43\n47\n", test.solution(2, 50));
        assertEquals("71\n73\n79\n83\n89\n97\n101\n103\n107\n109\n113\n", test.solution(70, 120));
        assertEquals("593\n599\n601\n607\n613\n617\n", test.solution(590, 618));
    }

}