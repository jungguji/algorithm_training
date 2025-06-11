package algorithm.baekjoon.graph.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class 숨바꼭질 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] NK = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            final int max = 100000;
            int N = NK[0];
            int K = NK[1];

            Queue<int[]> queue = new ArrayDeque<>();
            boolean[] visited = new boolean[max+1];

            // 초기값이랑 시작 위치
            queue.offer(new int[]{0, N});
            visited[N] = true;

            while (!queue.isEmpty()) {
                int[] arr = queue.poll();
                int time = arr[0];
                int position = arr[1];

                // base case
                if (position == K) {
                    System.out.println(time);
                    return;
                }

                int[] nextPositions = {position - 1, position + 1, position * 2};
                for (int nextPosition : nextPositions) {
                    if (
                            0 <= nextPosition && nextPosition <= max
                            && !visited[nextPosition]
                    ) {
                        queue.offer(new int[] {time + 1, nextPosition});
                        visited[nextPosition] = true;
                    }
                }
            }

        }
    }
}
