package algorithm.baekjoon.fourrulescalculation;

public class 정수_N개의_합 {
    public long sum(int[] a) {
        int answer = 0;

        for (int i : a) {
            answer += i;
        }

        return answer;
    }
}
