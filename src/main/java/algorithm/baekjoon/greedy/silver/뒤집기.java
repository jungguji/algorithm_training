package algorithm.baekjoon.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 뒤집기 {
    public static void main(String[] args) throws IOException {
        String input = getInputData(System.in);
        int answer = solution(input);
        System.out.println(answer);
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
        }
    }

    public static int solution(String args) {
        char[] array = args.toCharArray();

        int[] answer = new int[2];

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] != array[i]) {
                if (array[i - 1] == '0') {
                    answer[0] += 1;
                } else {
                    answer[1] += 1;
                }
            }
        }

        if (array[array.length - 1] == '0') {
            answer[0] += 1;
        } else {
            answer[1] += 1;
        }

        return answer[0] > answer[1] ? answer[1] : answer[0];
    }
}
