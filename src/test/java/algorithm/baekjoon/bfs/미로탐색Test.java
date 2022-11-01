package algorithm.baekjoon.bfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 미로탐색Test {

    private 미로탐색 test;

    @BeforeEach
    public void setUp() {
        test = new 미로탐색();
    }

    @Test
    void solution() {
        int[][] maze = new int[][]{{1, 0, 1, 1, 1, 1}
                , {1, 0, 1, 0, 1, 0}
                , {1, 0, 1, 0, 1, 1}
                , {1, 1, 1, 0, 1, 1}};

        assertEquals(15, test.solution(4, 6, maze));

        int[][] maze1 = new int[][]{{1, 1, 0, 1, 1, 0}
                , {1, 1, 0, 1, 1, 0}
                , {1, 1, 1, 1, 1, 1}
                , {1, 1, 1, 1, 0, 1}};

        assertEquals(9, test.solution(4, 6, maze1));

        int[][] maze2 = new int[][]{{1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}
                , {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1}};

        assertEquals(38, test.solution(2, 25, maze2));

        int[][] maze3 = new int[][]{{1, 0, 1, 1, 1, 1, 1}
                , {1, 1, 1, 0, 0, 0, 1}
                , {1, 0, 0, 0, 0, 0, 1}
                , {1, 0, 0, 0, 0, 0, 1}
                , {1, 0, 0, 0, 0, 0, 1}
                , {1, 0, 0, 0, 0, 0, 1}
                , {1, 1, 1, 1, 1, 1, 1}};

        assertEquals(13, test.solution(7, 7, maze3));
    }
}