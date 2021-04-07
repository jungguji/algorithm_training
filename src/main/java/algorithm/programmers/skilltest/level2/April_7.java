package algorithm.programmers.skilltest.level2;

import java.util.Arrays;

public class April_7 {
    public int solution(int[] people, int limit) {
        int head = 0;
        int tail = people.length - 1;

        Arrays.sort(people);

        int answer = 0;
        while (head <= tail) {
            int sum = people[head] + people[tail];

            if (sum <= limit) {
                ++head;
            }

            ++answer;
            --tail;
        }

        return answer;
    }
}
