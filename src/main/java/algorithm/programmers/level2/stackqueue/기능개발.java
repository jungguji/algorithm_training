package algorithm.programmers.level2.stackqueue;

import java.util.ArrayList;
import java.util.List;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int start = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (start != progresses.length) {
            int deploy = 0;
            for (int i = start; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }
            
            for (int i = start; i < progresses.length; i++) {
                if (progresses[start] < 100) {
                    break;
                }
                
                if (progresses[i] >= 100) {
                    ++start;
                    ++deploy;
                }
            }
            
            if (deploy != 0) {
                list.add(deploy);
            }
        }
        
//        int[] answer = list.stream().mapToInt(i -> i).toArray();
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
