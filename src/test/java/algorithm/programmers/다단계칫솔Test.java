package algorithm.programmers;

import algorithm.programmers.level3.recursion.다단계칫솔;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 다단계칫솔Test {

    다단계칫솔 test;
    @BeforeEach
    void setUp() {
        test = new 다단계칫솔();
    }

    @Test
    void test() {

        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};


        int[] solution = test.solution(enroll, referral, seller, amount);
        int[] 답 = {360, 958, 108, 0, 450, 18, 180, 1080};
        for (int i = 0; i < 답.length; ++i) {
            assertEquals(답[i], solution[i]);
        }
    }

    @Test
    void test1() {
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"sam", "emily", "jaimie", "edward"};
        int[] amount = {2,3,5,4};


        int[] solution = test.solution(enroll, referral, seller, amount);
        int[] 답 = {0, 110, 378, 180, 270, 450, 0, 0};
        for (int i = 0; i < 답.length; ++i) {
            assertEquals(답[i], solution[i]);
        }
    }
}