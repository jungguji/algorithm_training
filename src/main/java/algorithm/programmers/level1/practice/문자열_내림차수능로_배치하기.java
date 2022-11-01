package algorithm.programmers.level1.practice;

import java.util.Arrays;

public class 문자열_내림차수능로_배치하기 {

    public String solution(String s) {
        char[] array = s.toCharArray();

        Arrays.sort(array);

        char[] test = new char[s.length()];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            test[j++] = array[i];
        }

        String answer = String.valueOf(test);
        return answer;
    }
}
