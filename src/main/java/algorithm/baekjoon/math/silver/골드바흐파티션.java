package algorithm.baekjoon.math.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 골드바흐파티션 {

    public static final int MAX = 1000001;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long T = Long.parseLong(br.readLine());

        /*
        1000000까지의 소수를 구해놓고
        소수를 어레이에 담고
        0부터 length-1하면서
        N이 되는지 확인
        0+n-1 이 N보다 크면
        n-2, n-3 이런식으로 올느쪽을 줄이고
        N보다 작으면 1, 2,3 왼쪽 포인터를 증가
        n이랑 같으면 카운터 증가

        백만 + 백만 + 포인터 줄어가니까 백만
        3백만
        100 * 300000
        3억? 흠 ...

         */

        boolean[] 소수아닌목록 = new boolean[MAX];
        소수아닌목록[0] = true;
        소수아닌목록[1] = true;

        for (int i = 2; i * i < MAX; ++i) {
            if (!소수아닌목록[i]) {
                for (int j = i * i; j < MAX; j += i) {
                    소수아닌목록[j] = true;
                }
            }
        }

        List<Integer> 소수들 = new ArrayList<>();
        for (int i = 0; i < MAX; ++i) {
            if (!소수아닌목록[i]) {
                소수들.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());

            int front = 0;
            int rear = 소수들.size()-1;

            int count = 0;
            while (front <= rear) {
                int sum = 소수들.get(front) + 소수들.get(rear);

                if (sum == N) {
                    ++count;
                    ++front;
                    --rear;
                } else if (sum < N) {
                    ++front;
                } else {
                    --rear;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
