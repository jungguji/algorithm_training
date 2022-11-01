package algorithm.programmers.level1.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 실패율 {
    public int[] solution(int N, int[] stages) {
        int[] failUsers = new int[N + 2];
        for (int stage : stages) {
            failUsers[stage] += 1;
        }

        Map<Integer, Double> map = new HashMap<Integer, Double>();
        double userCount = stages.length;
        for (int i = 1; i <= N; i++) {
            double value = 0.0;
            if (failUsers[i] != 0 && userCount != 0) {
                value = (failUsers[i] / userCount) * 100;
                userCount -= failUsers[i];
            }
            map.put(i, value);
        }

        List<Integer> list = new ArrayList<Integer>(map.keySet());
        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });


        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }

}
