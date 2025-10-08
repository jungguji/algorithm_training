package algorithm.baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 하노이탑이동순서_복습_0 {
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // H(n) = 2 * H(n-1) + 1
        // H(1) = 2 * H(0) + 1 = 0 + 1 = 1
        // H(2) = 2 * H(1) + 1 = 2 + 1 = 3
        // H(3) = 2 * H(2) + 1 = 6 + 1 = 7
        sb.append(((int) Math.pow(2, N))-1).append("\n");

        move(N, 1, 3, 2);

        System.out.println(sb);
    }

    /*
    N을 target으로 옮기려면, N위에 있는 N-1을 먼저 옮겨야함
    단, 나보다 큰수가 내 위로 올수 없으므로,
    N-1을 N이 갈 target으로 옮기면 N이 갈수가 없으니
    N-1은 N이 갈 target이 아니라 다른 곳으로 옮겨야함
    그렇게 N-1을 먼저 target과 다른 곳으로 옮겨서 치우면 N을 옮길수 있으니
    N을 target으로 옮기고
    N-1도 target으로 옮김
    단, N-1을 옮기려면 N-2도 옮겨야하니까 마찬가지의 프로세스로 이동시키면됨
     */

    private static void move(int N, int start, int target, int temp) {
        // 내가 제일 작은 거니까 내가 갈곳으로 옮기면 됨
        if (N == 1) {
            sb.append(start).append(" ").append(target).append("\n");
            return;
        }

        move(N-1, start, temp, target);

        sb.append(start).append(" ").append(target).append("\n");

        move(N-1, temp, target, start);
    }
}
