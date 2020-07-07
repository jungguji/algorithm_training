package algorithm.programmers.level2.practice;

import static java.lang.Math.max;

public class 땅따먹기 {
    int solution(int[][] land) {
        for (int i = land.length - 2; i >= 0; i--) {
            int rowIndex = i + 1;
            land[i][0] += max(land[rowIndex][1], max(land[rowIndex][2], land[rowIndex][3]));
            land[i][1] += max(land[rowIndex][0], max(land[rowIndex][2], land[rowIndex][3]));
            land[i][2] += max(land[rowIndex][0], max(land[rowIndex][1], land[rowIndex][3]));
            land[i][3] += max(land[rowIndex][0], max(land[rowIndex][1], land[rowIndex][2]));
        }

        int answer = max(land[0][0], max(land[0][1], max(land[0][2], land[0][3])));
        return answer;
    }
}
