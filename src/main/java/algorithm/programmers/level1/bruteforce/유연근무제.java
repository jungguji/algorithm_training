package algorithm.programmers.level1.bruteforce;

public class 유연근무제 {

    private static final int WEEK = 7;

    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;

    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < schedules.length; ++i) {
            int currentDay = startday;
            boolean fail = false;

            for (int ii = 0; ii < WEEK; ++ii) {
                if (currentDay == SATURDAY || currentDay == SUNDAY) {
                    if (currentDay == SUNDAY) {
                        currentDay = 0;
                    }
                    ++currentDay;
                    continue;
                }

                int 실제_분 = (timelogs[i][ii] / 100) * 60 + (timelogs[i][ii] % 100);
                int 목표_분 = (schedules[i] / 100) * 60 + (schedules[i] % 100);

                if (실제_분 - 목표_분 > 10) {
                    fail = true;
                }

                ++currentDay;
            }

            if (!fail) {
                ++answer;
            }
        }

        return answer;
    }
}
