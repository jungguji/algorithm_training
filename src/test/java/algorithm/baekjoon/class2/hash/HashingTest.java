package algorithm.baekjoon.class2.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashingTest {

    @Test
    void solution() {
        Hashing test = new Hashing();
        assertEquals(4739715, test.solution("abcde"));
        assertEquals(25818, test.solution("zzz"));
        assertEquals(9, test.solution("i"));
        assertEquals(490694831L, test.solution("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
}