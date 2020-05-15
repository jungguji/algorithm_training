package algorithm.programmers.level2.hash;

import java.util.HashMap;
import java.util.Map;

public class 위장 {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String[] s : clothes) {
            int value = 1;
            String key = s[1];
            if (map.containsKey(key)) {
                value = map.get(key);
            }

            map.put(key, ++value);
        }

        int answer = 1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            answer *= entry.getValue();
        }

        return answer - 1;
    }
}
