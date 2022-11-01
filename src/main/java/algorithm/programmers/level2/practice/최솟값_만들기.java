package algorithm.programmers.level2.practice;

import java.util.Arrays;
import java.util.Comparator;

public class 최솟값_만들기 {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[(B.length - 1) - i];
        }

        return answer;
    }

    public int solution2(int[] A, int[] B) {

        Integer[] integerB = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(integerB, Comparator.reverseOrder());
        Arrays.sort(A);

        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * integerB[i];
        }

        return answer;
    }
}
