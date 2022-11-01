package algorithm.programmers.level2.greedy;

import java.util.Arrays;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;

        int answer = 0;
        while (left <= right) {
            int sum = people[left] + people[right];

            if (sum <= limit) {
                ++left;
            }

            ++answer;
            --right;
        }

        return answer;
    }
}
