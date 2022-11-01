package algorithm.programmers.level1.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {

    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) {
                ++oneCount;
            }

            if (answers[i] == two[i % two.length]) {
                ++twoCount;
            }

            if (answers[i] == three[i % three.length]) {
                ++threeCount;
            }
        }

        int max = 0;
        if (oneCount >= twoCount && oneCount >= threeCount) {
            max = oneCount;
        } else if (twoCount >= oneCount && twoCount >= threeCount) {
            max = twoCount;
        } else if (threeCount >= oneCount && threeCount >= twoCount) {
            max = threeCount;
        }

        List<Integer> list = new ArrayList<Integer>();
        if (max == oneCount) {
            list.add(1);
        }

        if (max == twoCount) {
            list.add(2);
        }

        if (max == threeCount) {
            list.add(3);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
