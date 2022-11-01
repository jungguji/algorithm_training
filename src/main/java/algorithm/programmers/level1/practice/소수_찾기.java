package algorithm.programmers.level1.practice;

public class 소수_찾기 {

    public int solution(int n) {
        boolean[] prime = new boolean[n + 1];

        prime[0] = true;
        prime[1] = true;

        for (int i = 2; (i * i) <= n; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        int answer = 0;
        for (boolean is : prime) {
            if (!is) {
                answer++;
            }
        }

        return answer;
    }
}
