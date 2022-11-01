package algorithm.programmers.level2.sort;

import java.util.Arrays;

public class H_Index {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;

        Arrays.sort(citations);

        for (int i = 0; i <= citations[n - 1]; i++) {
            int high = 0;

            for (int j = 0; j < n; j++) {
                if (i <= citations[j]) {
                    high++;
                }

                if (i <= high) {
                    answer = i;
                }
            }
        }

        return answer;
    }
}
