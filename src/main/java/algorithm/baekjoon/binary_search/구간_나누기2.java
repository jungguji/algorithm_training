package algorithm.baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 구간_나누기2 {

    private static int M;
    private static int[] array;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] NM = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            M = NM[1];

            array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            /*
            정답은 0부터 1만까지
            이 구간에서 ..
            구간 점수의 최대값을 가장 적은 낮은 수로 가져올것
            근데 M개 이하의 구간으로 나눌거임
            {1, 5, 4, 6, 2, 1, 3, 7} M = 3이면
            연속순열 집합으로 나누는데 M이하로 나눠야함
            근데 구간의 최대값 - 최솟값이 가장 낮게

            그래서... 파라매트릭 서치로
            구간을 나눠서 비교
            aaaaabbbbb 했을떄 a의 최대값으 구하면 되는데 ..
            a랑 b는 정답을 나누면됨
             */

            int current = -1;
            int step = 10001;

            while (step != 0) {
                while (current + step <= 10000 && 최대값으로_나눈구간이_M개_보다큼(current + step)) {
                    current += step;
                }

                step /= 2;
            }

            System.out.println(++current);
        }

    }

    private static boolean 최대값으로_나눈구간이_M개_보다큼(final int 최대값) {

        // 시작은 0번 인덱스부터 하니까
        int max = array[0];
        int min = array[0];
        int count = 0;

        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);

            // 구간의 점수의 최대값이 비교하련느 최대값보다 커지면
            // 커지면 안되는데 커진거니까 이전 수열까지를 구간으로 하기 위해서
            // max랑 min 값을 넘어간 값부터 비교하도록 변경하고
            // 구간의 숫자를 증가
            if (max - min > 최대값) {
                max = array[i];
                min = array[i];

                ++count;
            }
        }

        // 마지막 구간은 나누기만하고 숫자에 포함되기전에 끝나므로 +1한 상태로 비교
        return ++count > M;
    }
}
