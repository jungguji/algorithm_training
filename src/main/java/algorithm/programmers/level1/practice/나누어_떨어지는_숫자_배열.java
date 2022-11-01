package algorithm.programmers.level1.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);

        if (divisor == 1) {
            return arr;
        }

        List<Integer> list = new ArrayList<Integer>();

        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            list.add(-1);
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
