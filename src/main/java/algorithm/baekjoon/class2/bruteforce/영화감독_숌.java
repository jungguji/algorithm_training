package algorithm.baekjoon.class2.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 영화감독_숌 {
    private static final int REQUIRED_NAME = 666;

    public static void main(String[] args) throws IOException {
        int input = Integer.parseInt(getInputData(System.in));
        int answer = solution(input);

        System.out.println(answer);
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
        }
    }

    public static int solution(int n) {
        int i = 0;

        int answer = REQUIRED_NAME;
        while (i != n) {
            if (isContainRequiredName(answer)) {
                ++i;
            }

            ++answer;
        }

        return answer - 1;
    }

    private static boolean isContainRequiredName(int current) {
        while (current >= REQUIRED_NAME) {
            if (current % 1000 == REQUIRED_NAME) {
                return true;
            }

            current /= 10;
        }

        return false;
    }
}
