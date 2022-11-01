package algorithm.programmers.level1.practice;

import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어 {
    public int[] solution(int[] arr) {

        List<Integer> list = new ArrayList<Integer>();

        int pre = 100;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == pre) {
                continue;
            }

            pre = arr[i];
            list.add(arr[i]);
        }


        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
