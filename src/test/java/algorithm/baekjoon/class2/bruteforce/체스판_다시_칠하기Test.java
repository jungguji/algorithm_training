package algorithm.baekjoon.class2.bruteforce;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 체스판_다시_칠하기Test {

    private 체스판_다시_칠하기 test;

    @BeforeEach
    void setUp() {
        test = new 체스판_다시_칠하기();
    }

    @Test
    void solution() {
        char[][] test1 = new char[][]
        {{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
        ,{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
        ,{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
        ,{'B', 'W', 'B', 'B', 'B', 'W', 'B', 'W'}
        ,{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
        ,{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
        ,{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
        ,{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}};

        assertEquals(1, test.solution(test1, 8, 8));

        char[][] test2 = new char[][]
            {{'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B'},
            {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'B', 'W', 'B'},
            {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'B', 'W', 'B'}};

        assertEquals(12, test.solution(test2, 10, 13));

        char[][] test3 = new char[][]
                {{'W', 'W', 'B', 'B', 'B', 'B', 'B', 'B'},
                        {'W', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
                        {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
                        {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
                        {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
                        {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
                        {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
                        {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'}};

        assertEquals(31, test.solution(test3, 8, 8));

        char[][] test4 = new char[][]
                {{'W', 'B', 'B', 'W', 'W', 'W', 'B', 'B'},
                        {'B', 'B', 'W', 'W', 'W', 'B', 'W', 'B'},
                        {'B', 'B', 'W', 'W', 'B', 'B', 'B', 'B'},
                        {'B', 'W', 'W', 'W', 'W', 'W', 'W', 'W'},
                        {'W', 'B', 'W', 'B', 'B', 'W', 'B', 'B'},
                        {'W', 'W', 'W', 'W', 'B', 'W', 'B', 'B'},
                        {'W', 'W', 'W', 'W', 'B', 'W', 'B', 'W'},
                        {'W', 'W', 'W', 'W', 'W', 'W', 'B', 'B'}};

        assertEquals(31, test.solution(test4, 8, 8));

        char[][] test5 = new char[][]
                {{'B', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}};

        assertEquals(1, test.solution(test5, 8, 8));

        char[][] test6 = new char[][]
                {{'W', 'W', 'B', 'B', 'W', 'W', 'W', 'B', 'B', 'W'},
                        {'W', 'B', 'B', 'W', 'B', 'W', 'W', 'W', 'W', 'B'},
                        {'W', 'B', 'W', 'B', 'W', 'W', 'B', 'B', 'W', 'W'},
                        {'W', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'W'},
                        {'W', 'B', 'B', 'W', 'W', 'W', 'B', 'W', 'W', 'W'},
                        {'W', 'B', 'B', 'B', 'B', 'B', 'W', 'W', 'B', 'B'},
                        {'W', 'W', 'B', 'W', 'W', 'B', 'W', 'W', 'B', 'B'},
                        {'B', 'W', 'W', 'B', 'B', 'W', 'W', 'W', 'B', 'B'},
                        {'B', 'B', 'W', 'B', 'B', 'B', 'B', 'B', 'W', 'B'},
                        {'W', 'W', 'W', 'B', 'B', 'B', 'W', 'W', 'W', 'B'}};

        assertEquals(29, test.solution(test6, 10, 10));

        char[][] test7 = new char[][]
                {{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}};

        assertEquals(16, test.solution(test7, 9, 8));

        char[][] test8 = new char[][]
                {{'W', 'W', 'B', 'B', 'W', 'W', 'W', 'B', 'B', 'W'},
                        {'W', 'B', 'B', 'W', 'B', 'W', 'W', 'W', 'W', 'B'},
                        {'W', 'B', 'W', 'B', 'W', 'W', 'B', 'B', 'W', 'W'},
                        {'W', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'W'},
                        {'W', 'B', 'B', 'W', 'W', 'W', 'B', 'W', 'W', 'W'},
                        {'W', 'B', 'B', 'B', 'B', 'B', 'W', 'W', 'B', 'B'},
                        {'W', 'W', 'B', 'W', 'W', 'B', 'W', 'W', 'B', 'B'},
                        {'B', 'W', 'W', 'B', 'B', 'W', 'W', 'W', 'B', 'B'},
                        {'B', 'B', 'W', 'B', 'B', 'B', 'B', 'B', 'W', 'B'},
                        {'W', 'W', 'W', 'B', 'B', 'B', 'W', 'W', 'W', 'B'}};

        assertEquals(29, test.solution(test8, 10, 10));

        char[][] test9 = new char[][]
                {{'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                        {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                        {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                        {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                        {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                        {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                        {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                        {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}};

        assertEquals(0, test.solution(test9, 8, 16));

        char[][] test10 = new char[][]
                {{'B', 'B', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}};

        assertEquals(1, test.solution(test10, 8, 9));

        char[][] test11 = new char[][]
                {{'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}};

        assertEquals(0, test.solution(test11, 9, 8));
    }
}