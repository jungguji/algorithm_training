package algorithm.baekjoon.inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 알람_시계 {
    public static void main(String[] args) throws IOException {
        String[] array = getInputData(System.in).split(" ");
        int hour = Integer.parseInt(array[0]);
        int minute = Integer.parseInt(array[1]);

        if (minute < 45) {
            minute += (60 - 45);
            hour = hour == 0 ? 23 : hour - 1;
        } else {
            minute -= 45;
        }

        System.out.println(hour + " " + minute);
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
        }
    }
}
