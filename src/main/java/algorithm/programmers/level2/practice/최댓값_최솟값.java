package algorithm.programmers.level2.practice;

public class 최댓값_최솟값 {
    public String solution(String s) {
        String[] split = s.split(" ");
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;

        for (String str : split) {
            long value = Long.parseLong(str);
            max = max < value ? value : max;
            min = min > value ? value : min;
        }

        String answer = min + " " + max;
        return answer;
    }
}
