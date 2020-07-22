package algorithm.programmers.level2.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class 캐시 {
    private static final int MISS_RUN_TIME = 5;
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * MISS_RUN_TIME;
        }

        Map<String, Integer> lru = new LinkedHashMap<String, Integer>(cacheSize, 1, true){
            @Override
            public boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > cacheSize;
            }
        };

        int answer = 0;
        for(String key : cities) {
            key = key.toLowerCase();

            if(lru.containsKey(key)) {
                lru.get(key);
                answer += 1;
            } else {
                lru.put(key, 0);
                answer += MISS_RUN_TIME;
            }
        }

        return answer;
    }
}
