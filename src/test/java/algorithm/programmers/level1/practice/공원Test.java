package algorithm.programmers.level1.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class 공원Test {

    @Test
    void solution() {
        공원 공원 = new 공원();
        int solution = 공원.solution(new int[]{3}, new String[][]{{"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}, {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}});

        assertEquals(3, solution);
    }

    @Test
    void testSolution1() {
        공원 공원 = new 공원();

        // Example test case
        assertEquals(3, 공원.solution(new int[]{5, 3, 2}, new String[][]{
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}
        }));
    }

    @Test
    void testSolution() {
        공원 공원 = new 공원();

        // Example test case
        assertEquals(3, 공원.solution(new int[]{5, 3, 2}, new String[][]{
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}
        }));

        // Case 1: Single smallest mat size, empty park
        assertEquals(1, 공원.solution(new int[]{1}, new String[][]{
                {"-1"}
        }));

        // Case 2: Multiple mats, park fully occupied by people
        assertEquals(-1, 공원.solution(new int[]{3, 2, 1}, new String[][]{
                {"A", "B", "C"},
                {"D", "E", "F"},
                {"G", "H", "I"}
        }));

        // Case 3: Largest possible mat size fits the empty park exactly
        // Fill the park with empty strings ("-1") for Case 3
        String[][] caseThreePark = new String[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                caseThreePark[i][j] = "-1";
            }
        }

        assertEquals(20, 공원.solution(new int[]{20, 10, 5}, caseThreePark));

        // Case 4: Multiple mat sizes, partially occupied park, fits the largest mat size
        assertEquals(5, 공원.solution(new int[]{5, 3, 2}, new String[][]{
                {"-1", "-1", "-1", "-1", "-1", "A", "A", "A", "A", "A"},
                {"-1", "-1", "-1", "-1", "-1", "A", "A", "A", "A", "A"},
                {"-1", "-1", "-1", "-1", "-1", "A", "A", "A", "A", "A"},
                {"-1", "-1", "-1", "-1", "-1", "A", "A", "A", "A", "A"},
                {"-1", "-1", "-1", "-1", "-1", "A", "A", "A", "A", "A"},
                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}
        }));

        // Case 5: Non-square park with a few empty areas for testing adaptability
        assertEquals(2, 공원.solution(new int[]{3, 2, 1}, new String[][]{
                {"A", "-1", "-1", "B", "B"},
                {"A", "-1", "-1", "B", "B"},
                {"C", "C", "D", "D", "E"}
        }));

        // Case 6: Single mat, empty park, max park size
        String[][] caseSixPark = new String[50][50];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                caseSixPark[i][j] = "-1";
            }
        }
        assertEquals(1, 공원.solution(new int[]{1}, caseSixPark));


        // Case 7: Mixed mats with irregular park layout
        assertEquals(4, 공원.solution(new int[]{10, 4, 2}, new String[][]{
                {"-1", "-1", "-1", "-1", "A", "A", "-1", "-1"},
                {"-1", "-1", "-1", "-1", "A", "A", "-1", "-1"},
                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                {"-1", "-1", "-1", "-1", "B", "B", "B", "B"},
                {"-1", "-1", "-1", "-1", "B", "B", "B", "B"},
                {"-1", "-1", "-1", "-1", "C", "C", "C", "C"}
        }));

        // Case 8: Smallest mat cannot fit due to single obstacle
        assertEquals(-1, 공원.solution(new int[]{2}, new String[][]{
                {"-1", "A"},
                {"A", "A"}
        }));

        // Case 9: Multiple small mats, small gaps in between obstacles
        assertEquals(1, 공원.solution(new int[]{2, 1}, new String[][]{
                {"A", "-1", "A"},
                {"A", "-1", "A"},
                {"A", "-1", "A"}
        }));

        // Case 10: Complex park layout with no large fitting space
        assertEquals(3, 공원.solution(new int[]{5, 3, 2}, new String[][]{
                {"-1", "-1", "A", "-1", "-1", "A", "-1", "-1", "A"},
                {"-1", "-1", "A", "-1", "-1", "A", "-1", "-1", "A"},
                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                {"-1", "-1", "B", "B", "B", "B", "-1", "-1", "-1"},
                {"-1", "-1", "B", "B", "B", "B", "-1", "-1", "-1"},
                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                {"C", "C", "C", "C", "-1", "D", "D", "D", "D"}
        }));
    }

    @Test
    void testAdditionalCase() {
        공원 공원 = new 공원();

        // Additional test case where no mat can fit due to a single obstacle in the corner
        assertEquals(-1, 공원.solution(new int[]{3}, new String[][]{
                {"-1", "-1", "-1"},
                {"-1", "-1", "-1"},
                {"-1", "-1", "A"}
        }));
    }

    @Test
    void testAdditionalCase2() {
        공원 공원 = new 공원();

        // Additional test case where no mat can fit due to a single obstacle in the top right corner
        assertEquals(-1, 공원.solution(new int[]{3}, new String[][]{
                {"-1", "-1", "A"},
                {"-1", "-1", "-1"},
                {"-1", "-1", "-1"}
        }));
    }

    @Test
    void testAdditionalCase3() {
        공원 공원 = new 공원();

        // Additional test case where a 3x3 mat can fit despite an obstacle in the bottom left corner
        assertEquals(3, 공원.solution(new int[]{3}, new String[][]{
                {"A", "-1", "-1", "-1"},
                {"-1", "-1", "-1", "-1"},
                {"-1", "-1", "-1", "-1"}
        }));
    }

    @Test
    void test1() {
        공원 공원 = new 공원();

        int solution = 공원.solution(new int[]{3}, new String[][]{
                {"-1", "-1", "-1", "-1"},
                {"-1", "-1", "A", "-1"},
                {"-1", "-1", "-1", "-1"},
                {"-1", "-1", "-1", "-1"}
        });

        assertEquals(-1, solution);
    }

    @Test
    void test2() {
        공원 solution = new 공원();
        int result = solution.solution(new int[]{3}, new String[][]{
                {"-1", "-1", "-1", "-1"},
                {"-1", "-1", "-1", "-1"},
                {"A", "-1", "-1", "-1"}
        });

        assertEquals(3, result);
    }

    @Test
    void test3() {
        공원 공원 = new 공원();
        int solution = 공원.solution(new int[]{3}, new String[][]{
                {"-1", "-1", "-1"},
                {"-1", "A", "-1"},
                {"-1", "-1", "-1"}
        });

        assertEquals(-1, solution);
    }

    @Test
    void test4() {
        공원 공원 = new 공원();
        int solution = 공원.solution(new int[]{2, 3}, new String[][]{
                {"-1", "-1", "-1", "-1"},
                {"-1", "-1", "-1", "-1"},
                {"A", "-1", "-1", "-1"},
                {"-1", "-1", "-1", "-1"}
        });

        assertEquals(3, solution);
    }

    @Test
    void test5() {
        공원 공원 = new 공원();
        int solution = 공원.solution(new int[]{4, 3, 2}, new String[][]{
                {"-1", "-1", "-1", "-1"},
                {"-1", "A", "-1", "-1"},
                {"-1", "-1", "-1", "-1"},
                {"-1", "-1", "-1", "-1"}
        });

        assertEquals(2, solution);
    }

    @Test
    void test6() {
        공원 공원 = new 공원();
        int solution = 공원.solution(new int[]{3}, new String[][]{
                {"-1", "-1", "-1"},
                {"-1", "-1", "A"},
                {"-1", "-1", "-1"}
        });


        assertEquals(-1, solution);
    }

    @Test
    void test7() {
        공원 공원 = new 공원();
        int solution = 공원.solution(new int[]{3}, new String[][]{
                {"-1", "-1", "A", "-1"},
                {"-1", "-1", "-1", "-1"},
                {"-1", "A", "-1", "-1"},
                {"-1", "-1", "-1", "-1"}
        });


        assertEquals(-1, solution);
    }

    @Test
    void test8() {
        공원 공원 = new 공원();
        int solution = 공원.solution(new int[]{3}, new String[][]{
                {"A", "-1", "-1", "A"},
                {"-1", "-1", "-1", "-1"},
                {"A", "-1", "-1", "A"},
                {"A", "-1", "A", "A"}
        });


        assertEquals(-1, solution);
    }

    @Test
    void test9() {
        공원 공원 = new 공원();
        int solution = 공원.solution(new int[]{1}, new String[][]{
                {"A", "-1", "-1", "A"},
                {"-1", "-1", "-1", "-1"},
                {"A", "-1", "-1", "A"},
                {"A", "-1", "A", "A"}
        });


        assertEquals(1, solution);
    }

    @Test
    void test10() {
        공원 공원 = new 공원();
        int solution = 공원.solution(new int[]{2, 3}, new String[][]{
                {"A", "A", "A", "-1"},
                {"A", "-1", "-1", "-1"},
                {"A", "-1", "A", "A"},
                {"A", "-1", "A", "-1"}
        });


        assertEquals(-1, solution);
    }

    @Test
    void test11() {
        공원 공원 = new 공원();
        int solution = 공원.solution(new int[]{3}, new String[][]{
                {"A", "-1", "-1", "-1"},
                {"-1", "-1", "-1", "-1"},
                {"A", "-1", "-1", "A"},
                {"A", "A", "-1", "A"}
        });


        assertEquals(-1, solution);
    }

    @Test
    void test12() {
        공원 공원 = new 공원();
        int solution = 공원.solution(new int[]{5}, new String[][]{
                {"-1", "-1", "-1"},
                {"-1", "-1", "-1"},
                {"-1", "-1", "-1"}
        });

        assertEquals(-1, solution);
    }

    @Test
    void test13() {
        공원 공원 = new 공원();
        int solution = 공원.solution(new int[]{3}, new String[][]{
                {"-1", "-1", "A"},
                {"-1", "-1", "-1"},
                {"-1", "-1", "-1"}
        });

        assertEquals(-1, solution);
    }

    @Test
    void test14() {
        공원 공원 = new 공원();
        int solution = 공원.solution(new int[]{20}, new String[][]{
                {"-1"}
        });

        assertEquals(-1, solution);
    }

    @Test
    void testFinalMatFits() {
        공원 공원 = new 공원();

        // Test case where only the smallest mat fits in the park
        int[] mats = {20, 15, 10, 9, 8, 7, 6, 5, 4, 1};
        String[][] park = {
                {"A", "A", "A", "A", "A", "A", "A", "A", "A", "A"},
                {"A", "A", "A", "A", "A", "A", "A", "A", "A", "A"},
                {"A", "A", "A", "A", "A", "A", "A", "A", "A", "A"},
                {"A", "A", "A", "A", "A", "A", "A", "A", "A", "A"},
                {"A", "A", "A", "A", "-1", "A", "A", "A", "A", "A"},
                {"A", "A", "A", "A", "A", "A", "A", "A", "A", "A"},
                {"A", "A", "A", "A", "A", "A", "A", "A", "A", "A"},
                {"A", "A", "A", "A", "A", "A", "A", "A", "A", "A"},
                {"A", "A", "A", "A", "A", "A", "A", "A", "A", "A"},
                {"A", "A", "A", "A", "A", "A", "A", "A", "A", "A"}
        };

        assertEquals(1, 공원.solution(mats, park));
    }

    @Test
    void testLargePark() {
        공원 공원 = new 공원();

        // Define a large park of 50x50 with some empty spaces and obstacles
        int[] mats = {20, 15, 10, 5, 3, 2, 1};
        String[][] park = new String[50][50];

        // Fill the park with obstacles and some empty spaces
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                if ((i + j) % 4 == 0) {  // Some empty spots in a pattern
                    park[i][j] = "-1";
                } else {
                    park[i][j] = "A";  // Obstacles
                }
            }
        }

        // Leave a 5x5 empty area in the bottom-right corner for a mat to fit
        for (int i = 45; i < 50; i++) {
            for (int j = 45; j < 50; j++) {
                park[i][j] = "-1";
            }
        }

        // We expect the solution to find that the largest mat that fits is 5x5
        assertEquals(5, 공원.solution(mats, park));
    }

}