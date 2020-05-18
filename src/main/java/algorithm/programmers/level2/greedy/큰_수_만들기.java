package algorithm.programmers.level2.greedy;

public class 큰_수_만들기 {

    public String solution(String number, int k) {
        char[] toCharArray = number.toCharArray();
        
        StringBuilder answer = new StringBuilder();

        int idx = 0;
        for(int i = 0; i < number.length() - k; i++) {
            int max = 0;
            
            for(int j = idx; j <= k + i; j++) {
                int ch = toCharArray[j] - '0';
                if(max < ch) {
                    max = ch;
                    idx = j + 1;
                }
            }           
            answer.append(max);
        }
        
        return answer.toString();
    }
}
