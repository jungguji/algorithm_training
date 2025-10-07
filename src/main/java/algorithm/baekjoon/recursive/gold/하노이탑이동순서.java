package algorithm.baekjoon.recursive.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 하노이탑이동순서 {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // N-1을 두번 이동 시키고, 2*h(n-1)
        // n을 한번 이동 시킴
        // 2*h(n-1)+1
        // = h(n) = 2^n-1
        sb.append((1 << N) - 1).append("\n");

        hanoi(N, 1, 2, 3);

        System.out.println(sb);
    }

    private static void hanoi(int n, int start, int sub, int end) {
        // 원판이 하나면, 목표로 이동 시킴
        if (n == 1) {
            sb.append(start).append(" ").append(end).append("\n");
            return;
        }

        // n이 목표(end)로 이동하려면,
        // n위에 잇는 n-1이 다른 곳으로 이동해야하니까
        //    - 같은 곳(end)로 가면 조건에 안맞으니
        // n-1을 sub로 이동 시킴
        hanoi(n - 1, start, end, sub);

        // n-1 을 치웠으면 이제 n은 목표 지점으로 갈수 있음
        sb.append(start).append(" ").append(end).append("\n");

        // 아까 치워놨던 n-1도 이제 목표로 이동시킴
        hanoi(n - 1, sub, start, end);

        // 이걸 반복하면 끝
    }
}
