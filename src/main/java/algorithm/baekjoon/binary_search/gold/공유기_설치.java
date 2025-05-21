package algorithm.baekjoon.binary_search.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 공유기_설치 {

    private static int N;
    private static int C;
    private static int[] x;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] NC = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            N = NC[0];
            C = NC[1];

            x = new int[N];

            int max = 0;
            for (int i = 0; i < N; i++) {
                x[i] = Integer.parseInt(br.readLine());
                max = Math.max(x[i], max);
            }

            Arrays.sort(x);

            System.out.println(solution(max));
        }
    }

    private static int solution(int max) {
        int current = -1;
        int step = max +1;

        while (step != 0) {
            while (current + step <= max && isPossible(current + step)) {
                current += step;
            }

            step /= 2;
        }
        return current;
    }

    private static boolean isPossible(int 공유기간격) {

        // 이전에 공유기 설치한 위치
        int beforeIndex = 0;

        // 시작하자마자 설치했다고 침
        // 시작위치에 설치하는게 제일 이득이므로
        int 설치한_공유기_수 = 1;

        for (int i = 1; i < N; i++) {
            // 현재 공유기 위치랑 이전에 공유기 설치한 위치간의 간격이 공유기 간격보다 넓으면
            // 지금 위치에 공유기 설치할 수 있는거니까 위치를 옮기고 설치한 공유기 수를 증가시킴
            if (x[i] - x[beforeIndex] >= 공유기간격) {
                beforeIndex = i;
                ++설치한_공유기_수;
            }
        }

        return 설치한_공유기_수 >= C;
    }
}
