package algorithm.programmers.level1.practice;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 실패율TEST implements TEST {

    private 실패율 test;
    
    @BeforeEach
    public void setup() {
        test = new 실패율();
    }

//    @Test
//    public void getStageMapTest() {
//        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
//        Map<Integer, Integer> actual = new HashMap<Integer, Integer>();
//        actual.put(1, 12);
//        actual.put(2, 42);
//        actual.put(3, 50);
//        actual.put(4, 50);
//        actual.put(5, 0);
//        
//        Map<Integer, Integer> map = test.getStageMap(5, stages);
//        assertTrue(map.containsKey(1));
//        assertTrue(map.containsKey(2));
//        assertTrue(map.containsKey(3));
//        assertTrue(map.containsKey(4));
//        assertTrue(map.containsKey(5));
//        
//        assertEquals(12, map.get(1));
//        assertEquals(42, map.get(2));
//        assertEquals(50, map.get(3));
//        assertEquals(50, map.get(4));
//        assertEquals(0, map.get(5));
//    }
    
    @Test
    public void getStageMapTest2() {
        int[] stages = {1,1,1,1,2};
        Map<Integer, Integer> actual = new HashMap<Integer, Integer>();
        actual.put(1, 80);
        actual.put(2, 1);
        actual.put(3, 0);
        actual.put(4, 0);
        
        Map<Integer, Integer> map = test.getStageMap(4, stages);
        assertTrue(map.containsKey(1));
        assertTrue(map.containsKey(2));
        assertTrue(map.containsKey(3));
        assertTrue(map.containsKey(4));
        
        assertEquals(80, map.get(1));
        assertEquals(1, map.get(2));
        assertEquals(0, map.get(3));
        assertEquals(0, map.get(4));
    }
    
    @Test
    public void solutionTest() {
//        assertArrayEquals(new int[] {3,4,2,1,5}, test.solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3}));
//        assertArrayEquals(new int[] {4,1,2,3}, test.solution(4, new int[] {4,4,4,4,4}));
//        assertArrayEquals(new int[] {2,1,3,4}, test.solution(4, new int[] {1,1,1,1,2}));
    }

}
