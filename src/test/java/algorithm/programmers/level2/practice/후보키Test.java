package algorithm.programmers.level2.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class 후보키Test {

    private 후보키 test;

    @BeforeEach
    void setUp() {
        test = new 후보키();
    }

    void solution() {
        String[][] args = new String[][] {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
        assertEquals(2, test.solution(args));

        String[][] args1 = new String[][] {
                {"4",	"4",	"사랑",	"2020-07-03 오전 12:00:00",	"love"}
                , {"5",	"4",	"같은, 좋은, 와 비슷한",	"2020-07-03 오전 12:00:00",	"like"}
                , {"6",	"4",	"사과,대도시",	"2020-07-03 오전 12:00:00",	"apple"}
                , {"7",	"4",	"빌다,기도하다,에게 간청하다",	"2020-07-03 오전 12:00:00",	"pray"}
                , {"8",	"3",	"빌다,기도하다,에게 간청하다",	"2020-06-27 오전 12:00:00",	"pray"}
                , {"9",	"4",	"안녕",	"2020-07-03 오전 12:00:00",	"hi"}
                , {"10",	"3",	"같은, 좋은",	"2020-06-29 오전 12:00:00",	"like"}
                , {"11",	"2",	"나는 모자를 벗는다",	"2020-06-27 오전 12:00:00",	"I take off my hat"}};

        assertEquals(5, test.solution(args1));

        String[][] args2 = new String[][] {
                {"4",	"4",	"사랑",	"2020-07-03 오전 12:00:00",	"love"}
                , {"5",	"4",	"같은, 좋은, 와 비슷한",	"2020-07-03 오전 12:00:00",	"like"}
                , {"6",	"4",	"사과,대도시",	"2020-07-03 오전 12:00:00",	"apple"}
                , {"7",	"4",	"빌다,기도하다,에게 간청하다",	"2020-07-03 오전 12:00:00",	"pray"}
                , {"8",	"4",	"빌다,기도하다,에게 간청하다",	"2020-06-27 오전 12:00:00",	"pray"}
                , {"9",	"4",	"안녕",	"2020-07-03 오전 12:00:00",	"hi"}
                , {"10",	"3",	"같은, 좋은",	"2020-06-29 오전 12:00:00",	"like"}
                , {"11",	"2",	"나는 모자를 벗는다",	"2020-06-27 오전 12:00:00",	"I take off my hat"}};

        assertEquals(3, test.solution(args2));
    }

    @Test
    void getColumnIndex() {
        assertArrayEquals(new int[]{1,2,3,6}, test.test(78, 8));
    }

}