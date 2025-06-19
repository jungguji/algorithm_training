package algorithm.baekjoon.graph.shortestpath.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 숨바꼭질3 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // input
            int[] NK = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] line = new int[100001];

            Arrays.fill(line, Integer.MAX_VALUE);

            // solved
            Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
            queue.offer(new int[] {0, NK[0]});
            line[NK[0]] = 0;

            while (!queue.isEmpty()) {
                int[] poll = queue.poll();
                int 현재가중치 = poll[0];
                int 현재위치 = poll[1];

                if (현재가중치 > line[현재위치]) {
                    continue;
                }

                List<int[]> 갈수있는곳들 = new ArrayList<>();

                갈수있는곳들.add(new int[]{현재위치*2, 0});
                갈수있는곳들.add(new int[]{현재위치+1, 1});
                갈수있는곳들.add(new int[]{현재위치-1, 1});

                for (int[] ints : 갈수있는곳들) {
                    int 연결된노드 = ints[0];
                    int 연결된가중치 = ints[1];

                    int 더해질가중치 = 현재가중치+연결된가중치;
                    if (
                            0 <= 연결된노드 && 연결된노드 <= 100000
                            && 더해질가중치 < line[연결된노드]
                    ) {
                        queue.offer(new int[]{더해질가중치, 연결된노드});
                        line[연결된노드] = 더해질가중치;
                    }
                }
            }
            System.out.println(line[NK[1]]);
        }


    }
}
