package algorithm.programmers.level1.practice;

import java.util.ArrayList;
import java.util.List;

public class 크기가작은부분문자열 {
    public int solution(String t, String p) {
        int splitLength = p.length();

        char[] chars = t.toCharArray();

        List<Long> arrays = new ArrayList<>();
        int currentLength = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (currentLength < splitLength) {
                sb.append(chars[i]);
                ++currentLength;
            } else {
                arrays.add(Long.parseLong(sb.toString()));
                sb.setLength(0);
                i -= splitLength;
                currentLength = 0;
            }
        }

        arrays.add(Long.parseLong(sb.toString()));

        long value = Long.parseLong(p.toString());

        return (int) arrays
                .stream()
                .filter(x -> x <= value)
                .count();
    }
}

/**
 * GPT 코드
 */

/*
public int solution(String t, String p) {
    int splitLength = p.length();
    long pValue = Long.parseLong(p);
    int count = 0;

    // 첫 번째 부분 문자열을 숫자로 변환
    long currentWindow = Long.parseLong(t.substring(0, splitLength));
    if (currentWindow <= pValue) count++;

    // 슬라이딩 윈도우를 사용해 다음 부분 문자열을 계산
    for (int i = splitLength; i < t.length(); i++) {
        // 윈도우에서 맨 앞 자리 제거하고, 새 자리 추가
        currentWindow = (currentWindow % (long) Math.pow(10, splitLength - 1)) * 10
                        + (t.charAt(i) - '0');

        // 새로 계산한 윈도우가 p보다 작거나 같다면 count 증가
        if (currentWindow <= pValue) count++;
    }

    return count;
}
 */