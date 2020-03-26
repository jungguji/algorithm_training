package algorithm.programmers.level1.practice;

public class 두_정수_사이의_합 {
    
    public long solution(int a, int b) {
        /**
         * 등차수열의 합 공식
         * 첫번쨰 항이 a, 마지막 항이 b일 경우
         * Sn = n(a + b) / 2
         * return (b - a + 1) * (a + b) / 2;
         */
        
        if (a == b) {
            return a;
        }
        
        long answer = 0;
        long min = 0;
        long max = 0;
        
        if (a > b) {
            min = b;
            max = a;
        } else {
            max = b;
            min = a;
        }
        
        for (long i = min; i <= max; i++) {
            answer += i;
        }
        
        return answer;
    }
}
