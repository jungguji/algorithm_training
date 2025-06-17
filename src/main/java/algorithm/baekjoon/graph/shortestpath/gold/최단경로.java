package algorithm.baekjoon.graph.shortestpath.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 최단경로 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] VE = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int K = Integer.parseInt(br.readLine());

            int E = VE[1];

            Map<Integer, List<int[]>> graph = new HashMap();
            while (E-- > 0) {
                int[] uvw = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                List<int[]> nodeAndWeight = graph.getOrDefault(uvw[0], new ArrayList<>());
                nodeAndWeight.add(new int[]{uvw[1], uvw[2]});
                graph.put(uvw[0], nodeAndWeight);
            }

            // solved
            Queue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
            pq.offer(new int[]{0, K});
            Map<Integer, Integer> 경로 = new HashMap<>();

            while (!pq.isEmpty()) {
                int[] wv = pq.poll();
                int 현재_가중치 = wv[0];
                int 현재_노드 = wv[1];

                // 현재 가중치가 이미 탐색한 노드의 가중치보다 크면
                // 짧은 경로가 아니니까 필요 없음
                if (현재_가중치 > 경로.getOrDefault(현재_노드, Integer.MAX_VALUE)) {
                    continue;
                }

                // 현재 노드에 연결된 경로들 돌면서 확인
                for (int[] ints : graph.getOrDefault(현재_노드, new ArrayList<>())) {
                    int 연결된_노드 = ints[0];
                    int 연결된_가중치 = ints[1];

                    int 더해질_가중치 = 현재_가중치 + 연결된_가중치;
                    if (더해질_가중치 < 경로.getOrDefault(연결된_노드, Integer.MAX_VALUE)) {
                        pq.offer(new int[]{더해질_가중치, 연결된_노드});
                        경로.put(연결된_노드, 더해질_가중치);
                    }
                }
            }


            // output
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= VE[0]; ++i) {
                if (i == K) {
                    sb.append(0).append("\n");
                    continue;
                }

                int 최단경로 = 경로.getOrDefault(i, 0);
                if (최단경로 == 0) {
                    sb.append("INF").append("\n");
                    continue;
                }

                sb.append(최단경로).append("\n");
            }

            System.out.println(sb);
        }
    }
}
