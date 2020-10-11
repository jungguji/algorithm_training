package algorithm.programmers.level2.practice;

import java.time.LocalTime;

public class 방금그곡 {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";

        m = getSharpReplace(m);

        int maxPlayTime = 0;

        for (String music : musicinfos) {
            String[] info = music.split(",");

            LocalTime startTime = convertLocalTime(info[0]);
            LocalTime endTime = convertLocalTime(info[1]);

            LocalTime playTime = endTime.minusHours(startTime.getHour()).minusMinutes(startTime.getMinute());

            int playTimeToMinute = playTime.getHour() * 60 + playTime.getMinute();
            String sharpReplaceMelody = getSharpReplace(info[3]);

            String melody = getMelody(playTimeToMinute, sharpReplaceMelody);

            if (melody.contains(m)) {
                if (maxPlayTime < playTimeToMinute) {
                    answer = info[2];
                    maxPlayTime = playTimeToMinute;
                }
            }
        }

        return answer;
    }

    private LocalTime convertLocalTime(String time) {
        String[] hourAndMinute = time.split(":");

        return LocalTime.of(Integer.parseInt(hourAndMinute[0]), Integer.parseInt(hourAndMinute[1]), 0);
    }

    private String getSharpReplace(String arg) {
        return arg.replace("C#", "1")
                .replace("D#", "2")
                .replace("E#", "3")
                .replace("F#", "4")
                .replace("G#", "5")
                .replace("A#", "6");
    }

    private String getMelody(int playtime, String melody) {
        StringBuilder sb = new StringBuilder();

        char[] array = melody.toCharArray();
        for (int i = 0; i < playtime; i++) {
            sb.append(array[i % melody.length()]);
        }

        return sb.toString();
    }
}
