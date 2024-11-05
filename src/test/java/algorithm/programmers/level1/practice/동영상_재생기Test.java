package algorithm.programmers.level1.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 동영상_재생기Test {

    @Test
    void solution() {
        동영상_재생기 동영상_재생기 = new 동영상_재생기();

        String video_len = "34:33";
        String pos = "13:00";
        String op_start = "00:55";
        String op_end = "02:55";
        String[] commands = new String[] {"next", "prev"};
        String solution = 동영상_재생기.solution(video_len, pos, op_start, op_end, commands);

        assertEquals("13:00", solution);
    }

    @Test
    void solution1() {
        동영상_재생기 동영상_재생기 = new 동영상_재생기();

        String video_len = "10:55";
        String pos = "00:05";
        String op_start = "00:15";
        String op_end = "06:55";
        String[] commands = new String[] {"prev","next","next"};
        String solution = 동영상_재생기.solution(video_len, pos, op_start, op_end, commands);

        assertEquals("06:55", solution);
    }

    @Test
    void solution2() {
        동영상_재생기 동영상_재생기 = new 동영상_재생기();

        String video_len = "07:22";
        String pos = "04:05";
        String op_start = "00:15";
        String op_end = "04:07";
        String[] commands = new String[] {"next"};
        String solution = 동영상_재생기.solution(video_len, pos, op_start, op_end, commands);

        assertEquals("04:17", solution);
    }

    @Test
    void solution3() {
        동영상_재생기 동영상_재생기 = new 동영상_재생기();

        String video_len = "00:00";
        String pos = "00:00";
        String op_start = "00:00";
        String op_end = "00:00";
        String[] commands = new String[] {"next"};
        String solution = 동영상_재생기.solution(video_len, pos, op_start, op_end, commands);

        assertEquals("00:00", solution);
    }

    @Test
    void solution4() {
        동영상_재생기 동영상_재생기 = new 동영상_재생기();

        String video_len = "59:59";
        String pos = "59:59";
        String op_start = "59:59";
        String op_end = "59:59";
        String[] commands = new String[] {"next", "prev"};
        String solution = 동영상_재생기.solution(video_len, pos, op_start, op_end, commands);

        assertEquals("59:49", solution);
    }

    @Test
    void solution5() {
        동영상_재생기 동영상_재생기 = new 동영상_재생기();

        String video_len = "59:59";
        String pos = "59:59";
        String op_start = "00:00";
        String op_end = "59:59";
        String[] commands = new String[] {"next", "next", "next"};
        String solution = 동영상_재생기.solution(video_len, pos, op_start, op_end, commands);

        assertEquals("59:59", solution);
    }

    @Test
    void solution6() {
        동영상_재생기 동영상_재생기 = new 동영상_재생기();

        String video_len = "59:59";
        String pos = "00:00";
        String op_start = "00:20";
        String op_end = "00:59";
        String[] commands = new String[] {"next", "next", "next"};
        String solution = 동영상_재생기.solution(video_len, pos, op_start, op_end, commands);

        assertEquals("01:09", solution);
    }

    @Test
    void solution7() {
        동영상_재생기 동영상_재생기 = new 동영상_재생기();

        String video_len = "10:00";
        String pos = "00:03";
        String op_start = "00:00";
        String op_end = "00:05";
        String[] commands = new String[] {"prev", "next"};
        String solution = 동영상_재생기.solution(video_len, pos, op_start, op_end, commands);

        assertEquals("00:15", solution);
    }

    @Test
    void solution8() {
        동영상_재생기 동영상_재생기 = new 동영상_재생기();

        String video_len = "30:00";
        String pos = "01:55";
        String op_start = "01:00";
        String op_end = "01:30";
        String[] commands = new String[] {"next"};
        String solution = 동영상_재생기.solution(video_len, pos, op_start, op_end, commands);

        assertEquals("02:05", solution);
    }

    @Test
    void solution9() {
        동영상_재생기 동영상_재생기 = new 동영상_재생기();

        String video_len = "10:00";
        String pos = "07:05";
        String op_start = "01:00";
        String op_end = "01:30";
        String[] commands = new String[] {"prev"};
        String solution = 동영상_재생기.solution(video_len, pos, op_start, op_end, commands);

        assertEquals("06:55", solution);
    }

    @Test
    void solution10() {
        동영상_재생기 동영상_재생기 = new 동영상_재생기();

        String video_len = "30:00";
        String pos = "29:55";
        String op_start = "01:00";
        String op_end = "01:30";
        String[] commands = new String[] {"next"};
        String solution = 동영상_재생기.solution(video_len, pos, op_start, op_end, commands);

        assertEquals("30:00", solution);
    }
}