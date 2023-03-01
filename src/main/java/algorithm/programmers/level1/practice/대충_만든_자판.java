package algorithm.programmers.level1.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 대충_만든_자판 {

    /**
     * targets size 만한 answer return
     *
     * keymap에 있는 애들 쪼개서
     * map에 key랑 index 담아
     * target 쪼개
     * 쪼갠애로 map에서 검색해
     * 나온 index 중에 제일 작은 애로 더해
     * Math.min()
     * 없으면? -1 return
     *
     * @param keymap
     * @param targets
     * @return
     */
    public int[] solution(String[] keymap, String[] targets) {

        List<Map<String, Integer>> keyIndex = getKeyIndex(keymap);

        int[] answer = new int[targets.length];

        for (int i=0; i<targets.length; ++i) {
            String target = targets[i];
            char[] chars = target.toCharArray();

            answer[i] = getSum(keyIndex, chars);
        }

        return answer;
    }

    private List<Map<String, Integer>> getKeyIndex(String[] keymap) {
        List<Map<String, Integer>> list = new ArrayList<>();

        for (String s : keymap) {
            char[] chars = s.toCharArray();
            HashMap<String, Integer> map = new HashMap<>();

            for (int i = chars.length-1; i > -1; --i) {
                map.put(String.valueOf(chars[i]), i+1);
            }

            list.add(map);
        }

        return list;
    }

    private int getSum(List<Map<String, Integer>> keyIndex, char[] targets) {
        int sum = 0;

        for (char target : targets) {
            int min = getMinCount(keyIndex, target);

            sum += min == 101 ? -1 : min;
        }

        return sum;
    }

    private int getMinCount(List<Map<String, Integer>> keyIndex, char target) {
        int min = 101;

        for (Map<String, Integer> index : keyIndex) {
            min = Math.min(min, index.getOrDefault(String.valueOf(target), 101));
        }
        return min;
    }
}
