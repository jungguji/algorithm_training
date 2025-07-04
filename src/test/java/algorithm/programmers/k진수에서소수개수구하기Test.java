package algorithm.programmers;

import algorithm.programmers.level2.avatar.k진수에서소수개수구하기;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class k진수에서소수개수구하기Test {

    private k진수에서소수개수구하기 test = new k진수에서소수개수구하기();

    @Test
    void solution() {
        assertEquals(3, test.solution(437674,3));
        assertEquals(2, test.solution(110011,10));
        assertEquals(0, test.solution(1,3));
        assertEquals(0, test.solution(10,10));
        assertEquals(0, test.solution(1,10));
        assertEquals(1, test.solution(2,10));
        assertEquals(0, test.solution(5, 3));      // 5(10) -> 12(3) -> "1" + "2" -> 2는 소수
        assertEquals(1, test.solution(4, 3));      // 4(10) -> 11(3) -> "1" + "1" -> 1은 소수 아님
        assertEquals(0, test.solution(101, 10));      // 4(10) -> 11(3) -> "1" + "1" -> 1은 소수 아님
        assertEquals(0, test.solution(883438, 3));      // 4(10) -> 11(3) -> "1" + "1" -> 1은 소수 아님
        assertEquals(1, test.solution( 56011, 6));      // 4(10) -> 11(3) -> "1" + "1" -> 1은 소수 아님
        assertEquals(0, test.solution( 9, 3));      // 4(10) -> 11(3) -> "1" + "1" -> 1은 소수 아님
        assertEquals(0, test.solution( 1000000, 10));      // 4(10) -> 11(3) -> "1" + "1" -> 1은 소수 아님
        assertEquals(0, test.solution( 49, 10));      // 4(10) -> 11(3) -> "1" + "1" -> 1은 소수 아님
        assertEquals(0, test.solution( 797161, 3));      // 4(10) -> 11(3) -> "1" + "1" -> 1은 소수 아님
        assertEquals(0, test.solution( 30, 3));      // 4(10) -> 11(3) -> "1" + "1" -> 1은 소수 아님
        assertEquals(0, test.solution( 88573, 3));      // 4(10) -> 11(3) -> "1" + "1" -> 1은 소수 아님
    }
}