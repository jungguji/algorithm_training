package algorithm.programmers.level1.practice;

import java.util.Arrays;

public class 공원 {
    public int solution(int[] mats, String[][] park) {
        int[][] intParks = getIntParks(park);

        Arrays.sort(mats);

        int answer = -1;

        for (int i = mats.length -1; i >= 0; --i) {
            boolean[][] visit = new boolean[intParks.length][intParks[0].length];
            int height = 0;
            int widthStartIndex = 0;

            for (int y = 0; y < intParks.length; ++y) {

                for (int x = widthStartIndex; x < intParks[0].length; ++x) {
                    if (!visit[y][x] && intParks[y][x] >= mats[i]) {
                        ++height;
                        visit[y][x] = true;
                        widthStartIndex = x;
                        break;
                    } else if (height > 0) {
                        y -= height+1;
                        height = 0;
                        widthStartIndex = 0;
                        break;
                    }
                }

                if (height == mats[i]) {
                    return mats[i];
                }
            }
        }

        return answer;
    }

    private int[][] getIntParks(String[][] park) {
        int[][] intParks = new int[park.length][park[0].length];

        for (int y = 0; y < park.length; ++y) {
            int value = 0;

            for (int x = park[0].length-1; x >= 0; --x) {
                if ("-1".equals(park[y][x])) {
                    intParks[y][x] = ++value;
                } else {
                    intParks[y][x] = -1;
                    value = 0;
                }
            }
        }
        return intParks;
    }
}

/**
 * GPT 답변
 */

/*
public int solution(int[] mats, String[][] park) {
    Arrays.sort(mats); // 큰 돗자리부터 탐색
    for (int i = mats.length - 1; i >= 0; i--) {
        int matSize = mats[i];
        if (canPlaceMat(park, matSize)) {
            return matSize;
        }
    }
    return -1;
}

private boolean canPlaceMat(String[][] park, int size) {
    for (int y = 0; y <= park.length - size; y++) {
        for (int x = 0; x <= park[0].length - size; x++) {
            if (isAreaEmpty(park, y, x, size)) {
                return true;
            }
        }
    }
    return false;
}

private boolean isAreaEmpty(String[][] park, int startY, int startX, int size) {
    for (int y = startY; y < startY + size; y++) {
        for (int x = startX; x < startX + size; x++) {
            if (!park[y][x].equals("-1")) {
                return false;
            }
        }
    }
    return true;
}
 */