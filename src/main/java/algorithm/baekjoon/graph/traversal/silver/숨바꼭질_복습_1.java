package algorithm.baekjoon.graph.traversal.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 숨바꼭질_복습_1 {

    private static final int LIMIT = 100001;
    private static final int[] 갈수있는_노드_위치 = new int[]{-1, 1, 2};

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] NK = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int N = NK[0];
            int K = NK[1];

            boolean[] visited = new boolean[LIMIT];

            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{N, 0});
            visited[N] = true;

            int answer = 0 ;
            while (!queue.isEmpty()) {
                int[] poll = queue.poll();
                int position = poll[0];
                int seconds = poll[1];

                if (position == K) {
                    answer = seconds;
                }

                for (int i = 0; i < 갈수있는_노드_위치.length; ++i) {
                    int next_position = position;

                    if (i == 2) {
                        next_position *= 갈수있는_노드_위치[i];
                    } else {
                        next_position += 갈수있는_노드_위치[i];
                    }

                    if (
                            next_position < 0
                            || next_position >= LIMIT
                            || visited[next_position]
                    )  {
                        continue;
                    }

                    queue.offer(new int[]{next_position, seconds+1});
                    visited[next_position] = true;
                }
            }

            System.out.println(answer);
        }
    }
}
