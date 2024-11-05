package algorithm.programmers.level1.practice;

public class 동영상_재생기 {

    public static final String COLON = ":";

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLength = convertToInt(video_len);
        int startTime = convertToInt(op_start);
        int endTime = convertToInt(op_end);
        int position = convertToInt(pos);

        boolean isNext = true;
        for (String command : commands) {
            if (position >= startTime && position <= endTime) {
                position = endTime;
            }

            switch (command) {
                case "prev" :
                    position = position < 10 ? 0 : position - 10;
                    isNext = false;
                    break;
                case "next":
                    position = (videoLength - position) < 10 ? videoLength : position + 10;
                    isNext = true;
                    break;
            }

            position = calculateTime(position, isNext);

            if (position >= startTime && position <= endTime) {
                position = endTime;
            }

            if (position > videoLength) {
                position = videoLength;
            }
        }

        String minute = getMinute(position);
        String second = getSecond(position);

        return minute + COLON + second;
    }

    private String getMinute(int position) {
        String minute = String.valueOf((position / 100));
        if (minute.length() == 1) {
            minute = "0" + minute;
        }
        return minute;
    }

    private String getSecond(int position) {
        String second = String.valueOf((position % 100));
        if (second.length() == 1) {
            second = "0" + second;
        }
        return second;
    }

    private int convertToInt(String time) {
        return Integer.parseInt(time.replace(COLON, ""));
    }

    private int calculateTime(int time, boolean isNext) {
        int second = time % 100;
        if (second >= 60) {
            time = isNext ? time + 40 : time - 40;
        }
        return time;
    }
}
