package algorithm.programmers.level1.practice;

import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        for (int i : d) {
            if (budget < i) {
                break;
            }
            
            budget -= i;
            ++answer;
        }
        
        return answer;
    }
}
