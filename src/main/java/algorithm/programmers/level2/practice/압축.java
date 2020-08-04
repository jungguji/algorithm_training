package algorithm.programmers.level2.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 압축 {
    private static final int CAPITAL_A = 65;
    private static final Character LAST_INIT_ALPHABET = 'Z';

    public int[] solution(String msg) {
        int[] answer = getDictionaryIndex(msg.toCharArray(), initIndexMap());

        return answer;
    }

    private Map<String, Integer> initIndexMap() {
        Map<String, Integer> indexMap = new HashMap<>();

        Character start = CAPITAL_A;
        int i = 1;

        while (start <= LAST_INIT_ALPHABET) {

            indexMap.put(String.valueOf(start), i);

            ++start;
            ++i;
        }

        return indexMap;
    }

    private int[] getDictionaryIndex(char[] charArray, Map<String, Integer> indexMap) {
        int i = 0;
        int arrayLength = charArray.length;
        int lastIndex = indexMap.get(String.valueOf(LAST_INIT_ALPHABET));

        List<Integer> answer = new ArrayList<>();

        while (i < arrayLength) {
            StringBuilder sb = new StringBuilder();

            int value = 0;
            int jump = 0;
            for (int j = i; j < arrayLength; j++) {
                sb.append(charArray[j]);

                String key = sb.toString();
                if (indexMap.containsKey(key)) {
                    value = indexMap.get(key);
                    jump++;

                    if (j +1 == arrayLength) {
                        answer.add(value);
                        i += jump;
                    }

                    continue;
                }

                answer.add(value);
                i += jump;
                break;
            }

            if (!indexMap.containsKey(sb.toString())) {
                indexMap.put(sb.toString(), ++lastIndex);
            }

            sb.setLength(0);
        }

        return answer.stream().mapToInt(index -> index).toArray();
    }
}
