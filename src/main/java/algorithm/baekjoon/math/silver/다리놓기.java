package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 다리놓기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int R = array[0];
            int M = array[1];

            // M C N을 계산하는 로직
            // M 개 중 N개를 뽑는다. (단, N은 M-N과 비교하여 더 작은 값으로 계산)
            // 10명 중에서 8명을 뽑는거랑
            // 10명 중에서 안 뽑힐 2명을 완전히 같음
            if (R > M / 2) {
                R = M - R;
            }

            long result = 1;
            for (int i = 1; i <= R; i++) {
                result = result * (M - i + 1) / i;
            }
            System.out.println(result);
        }
    }
}
