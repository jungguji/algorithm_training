package algorithm.programmers.level1.avatar;

import java.util.*;

public class 가장_많이_받은_선물 {
    public int solution(String[] friends, String[] gifts) {
        // 2차원 배열 만들어서
        // friend[0] 이 이차원 [0]
        // Friend[0][0]은 friend[0]이 friend[0]에게 준 선물 수
        // 으로하면 찾기 귀찮의까 맵으로 해서 처리하자..

        HashMap<String, Integer> nameToIndex = new HashMap<>();

        for (int i = 0; i < friends.length; ++i) {
            nameToIndex.put(friends[i], i);
        }

        int[][] giftHistory = new int[friends.length][friends.length];
        int[] 선물지수 = new int[friends.length];

        // 1차원 배열 만들어서 인ㅇ덱스대로
        // 각 친구들의 선물지수로 따로 저장

        for (String gift : gifts) {
            final String[] aAndB = gift.split(" ");

            Integer aIndex = nameToIndex.get(aAndB[0]);
            Integer bIndex = nameToIndex.get(aAndB[1]);

            ++giftHistory[aIndex][bIndex];

            ++선물지수[aIndex];
            --선물지수[bIndex];
        }

        int[] result = new int[friends.length];

        for (int i = 0; i < giftHistory.length; ++i) {
            for (int ii = i; ii < giftHistory.length; ++ii) {
                if (ii == i) {
                    continue;
                }

                if (giftHistory[i][ii] - giftHistory[ii][i] > 0) {
                    ++result[i];
                } else if (giftHistory[i][ii] - giftHistory[ii][i] < 0) {
                    ++result[ii];
                } else {
                    if (선물지수[i] - 선물지수[ii] > 0) {
                        ++result[i];
                    } else if (선물지수[i] - 선물지수[ii] < 0) {
                        ++result[ii];
                    }
                }
            }
        }

        return Arrays.stream(result)
                .max()
                .getAsInt();
    }
}
