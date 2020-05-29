package algorithm.baekjoon.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithm.programmers.level1.practice.TEST;

public class 회의실배정Test implements TEST {

    private 회의실배정 test;
    
    @BeforeEach
    public void setup() {
        test = new 회의실배정();
    }

    @Test
    public void solutionTest() {
        List<Integer[]> list = new ArrayList<Integer[]>();
        list = Arrays.asList(
                new Integer[] {1 ,4}
                , new Integer[] {3 ,5}
                , new Integer[] {0 ,6}
                , new Integer[] {5 ,7}
                , new Integer[] {3 ,8}
                , new Integer[] {5 ,9}
                , new Integer[] {6 ,10}
                , new Integer[] {8 ,11}
                , new Integer[] {8 ,12}
                , new Integer[] {2 ,13}
                , new Integer[] {12 ,14}
                );
        
        assertEquals(4, test.getMaxConferenceCount(list));
        
        list = Arrays.asList(
                new Integer[] {1 ,1}
                , new Integer[] {1 ,2}
                , new Integer[] {2 ,4}
                );
        assertEquals(3, test.getMaxConferenceCount(list));
        
        list = Arrays.asList(
                new Integer[] {1 ,1}
                , new Integer[] {1 ,1}
                , new Integer[] {1 ,1}
                );
        assertEquals(3, test.getMaxConferenceCount(list));
        
        list = Arrays.asList(
                new Integer[] {1 ,2}
                , new Integer[] {2 ,2}
                , new Integer[] {2 ,3}
                , new Integer[] {3 ,4}
                );
        assertEquals(4, test.getMaxConferenceCount(list));
        
        list = Arrays.asList(
                new Integer[] {1 ,7}
                , new Integer[] {2 ,3}
                , new Integer[] {4 ,5}
                , new Integer[] {7 ,100}
                );
        assertEquals(3, test.getMaxConferenceCount(list));
        
        list = Arrays.asList(
                new Integer[] {11, 11}
                , new Integer[] {11, 11}
                , new Integer[] {9, 11}
                , new Integer[] {10, 11}
                , new Integer[] {11, 11}
                , new Integer[] {8, 11}
                , new Integer[] {7, 10}
                , new Integer[] {10, 10}
                , new Integer[] {9, 10}
                , new Integer[] {10, 10}
                , new Integer[] {6, 10}
                );
        assertEquals(7, test.getMaxConferenceCount(list));
        
        list = Arrays.asList(
                new Integer[] {8, 8} 
                , new Integer[] {5, 8}
                , new Integer[] {3, 4}
                , new Integer[] {2, 5} 
                , new Integer[] {2, 7}
                , new Integer[] {8, 8}
                , new Integer[] {1, 10}
                , new Integer[] {3, 3}
                , new Integer[] {10, 10}
                );
        assertEquals(6, test.getMaxConferenceCount(list));
    }

}
