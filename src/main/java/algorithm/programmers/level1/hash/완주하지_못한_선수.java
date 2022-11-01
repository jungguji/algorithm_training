package algorithm.programmers.level1.hash;

import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수 {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < participant.length; i++) {
            map.compute(participant[i], (k, v) -> v != null ? null : -1);
        }

        for (int i = 0; i < completion.length; i++) {
            map.compute(completion[i], (k, v) -> v != null ? null : -1);
        }

        return map.keySet().iterator().next();
    }
}
