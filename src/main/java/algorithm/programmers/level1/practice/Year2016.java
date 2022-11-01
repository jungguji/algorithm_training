package algorithm.programmers.level1.practice;

public class Year2016 {
    public String solution(int a, int b) {
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] lastDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDay = 0;
        for (int i = 1; i < a; i++) {
            totalDay += lastDays[i - 1];
        }
        totalDay += b;

        String answer = days[(totalDay % 7)];
        return answer;
    }
}
