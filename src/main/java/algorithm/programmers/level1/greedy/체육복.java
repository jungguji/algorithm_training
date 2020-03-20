package algorithm.programmers.level1.greedy;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        for (int i = 0; i < reserve.length; i++) {
            
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reserve[i] = -100;
                    lost[j] = -1;
                    ++answer;
                    break;
                }
            }
        }
        
        
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                int lostStudentNumber = lost[j];
                
                if (lostStudentNumber == reserve[i]) {
                    
                    lost[j] = -1;
                    ++answer;
                    break;
                    
                } else if (lostStudentNumber == (reserve[i] + 1) || lostStudentNumber == (reserve[i] - 1)) {
                    ++answer;
                    lost[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}
