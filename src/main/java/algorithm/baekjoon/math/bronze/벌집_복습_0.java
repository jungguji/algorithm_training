package algorithm.baekjoon.math.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());

        int layer = 1;
        long min_value = 1;
        long max_value = 1;

        while (min_value > N || N > max_value) {

            // 다음 layer의 최소값은 이전 layer의 초대값에서 +1 해야 맞음
            // 층이 바뀌었으니까

            min_value = max_value + 1;
            // 벌집이 6의 배수만큼 커짐
            max_value += (layer * 6L);
            ++layer;
        }

        System.out.println(layer);
    }
}
