package algorithm.baekjoon.class2.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 벌집 {
    public static void main(String[] args) throws IOException {
        long position = Integer.parseInt(getInputData(System.in));

        long layer = getLayer(--position);

        System.out.println(layer);
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
        }
    }

    private static long getLayer(long position) {
        long layer = 1;
        while (position > 0) {
            position -= 6 * layer++;
        }

        return layer;
    }
}
