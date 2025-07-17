package algorithm.programmers.level1.avatar;

import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {

    private static final String[] 유형 = new String[]{"R", "T", "C", "F", "J", "M", "A", "N"};
    private static final String[][] 지표 = new String[][]{{"R", "T"}, {"C","F"}, {"J", "M"}, {"A", "N"}};

    public String solution(String[] survey, int[] choices) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : 유형) {
            map.put(s, 0);
        }

        for (int i = 0; i < survey.length; ++i) {
            String[] split = survey[i].split("");
            int choice = choices[i] - 4;
            if (choice < 0) {
                map.put(split[0], map.get(split[0]) + (choice * -1));
            } else if (0 < choice) {
                map.put(split[1], map.get(split[1]) + choice);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (String[] strings : 지표) {
            Integer 성격1 = map.get(strings[0]);
            Integer 성격2 = map.get(strings[1]);

            if (성격1 > 성격2) {
                sb.append(strings[0]);
            } else if (성격1 < 성격2) {
                sb.append(strings[1]);
            } else {
                sb.append((char)Math.min(strings[0].charAt(0), strings[1].charAt(0)));
            }
        }

        return sb.toString();
    }
}
