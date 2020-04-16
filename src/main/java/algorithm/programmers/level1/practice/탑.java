package algorithm.programmers.level1.practice;

public class 탑 {
    public int[] solution(int[] heights) {
        int length = heights.length;
        int[] answer = new int[length];
        
        for (int i = length - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (heights[j] > heights[i]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}
