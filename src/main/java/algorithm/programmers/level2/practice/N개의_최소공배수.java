package algorithm.programmers.level2.practice;

import java.util.Arrays;

public class N개의_최소공배수 {
    public int solution(int[] arr) {
        int answer = 0;

        Arrays.sort(arr);

        int maxNumber = arr[arr.length - 1];

        int count = 1;
        while (answer == 0) {
            for (int i = arr.length - 2; i > -1; i--) {
                if ((maxNumber * count) % arr[i] != 0) {
                    answer = 0;
                    break;
                }

                answer = maxNumber * count;
            }

            ++count;
        }

        return answer;
    }
}
