package algorithm.programmers.level1.practice;

public class 문자열_내_P와_y의_개수 {

    boolean solution(String s) {
        if (!s.contains("p") && !s.contains("y")) {
            return true;
        }


        int is = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("p".equalsIgnoreCase(String.valueOf(s.charAt(i)))) {
                ++is;
            } else if ("y".equalsIgnoreCase(String.valueOf(s.charAt(i)))) {
                --is;
            }
        }

        return is == 0;
    }
}
