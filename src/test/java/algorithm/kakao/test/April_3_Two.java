package algorithm.kakao.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class April_3_Two {
    public int solution(int[][] needs, int r) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < needs.length; i++) {
            int index = 0;
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < needs[0].length; j++) {
                if (needs[i][j] == 1) {
                    map.put(index, map.getOrDefault(index, 0) + 1);
                }

                ++index;
            }
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (e1, e2) -> {
            return Integer.compare(e2.getValue(), e1.getValue());
        });

        int answer = 0;


        return answer;
    }

    private boolean isAlreadyPart(String[] parts, String alreadyParts) {
        boolean isExist = true;
        for (String part : parts) {
            if (!alreadyParts.contains(part)) {
                isExist = false;
                break;
            }
        }

        return isExist;
    }
}
