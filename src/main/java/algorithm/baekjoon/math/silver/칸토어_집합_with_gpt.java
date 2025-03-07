package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 칸토어_집합_with_gpt {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            while ((input = br.readLine()) != null) {
                int n = Integer.parseInt(input);
                int size = (int) Math.pow(3, n);

                char[] array = new char[size];
                Arrays.fill(array, '-'); // 전체를 '-'로 초기화

                generateCantor(array, 0, size);
                System.out.println(array);
            }
        }
    }

    public static void generateCantor(char[] array, int start, int length) {
        if (length == 1) {
            return;
        }

        int segment = length / 3;
        Arrays.fill(array, start + segment, start + 2 * segment, ' '); // 가운데 부분을 공백으로 변경

        generateCantor(array, start, segment); // 왼쪽 부분 재귀 호출
        generateCantor(array, start + 2 * segment, segment); // 오른쪽 부분 재귀 호출
    }
}
