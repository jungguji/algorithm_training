package algorithm.baekjoon.graph.shortestpath.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 최단경로_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // V = 20,000
        // E = 300,000
        int[] VE = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int V = VE[0];
        int E = VE[1];

        // K = 20,000
        int K = Integer.parseInt(br.readLine());

        List<List<int[]>> matrix = getMatrix(V, E, br);

        // solved
        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(i -> i[1]));
        // 시작점 K, 처음 시작이니까 가중치 0
        queue.offer(new int[]{K, 0});

        // 각 정점별로 가장 빨리간 경로의 길이 저장
        int[] 가중치저장 = new int[V+1];
        Arrays.fill(가중치저장, Integer.MAX_VALUE);
        가중치저장[K] = 0;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int node = poll[0];
            int weight = poll[1];

            // 이미 지니간 길인데
            // 지금 오는길 가중치가 더 크면 탈필요가 없음
            if (가중치저장[node] < weight) {
                continue;
            }

            // 그래프탐색처럼 자기랑 연결된 노드들 탐색
            for (int[] ints : matrix.get(node)) {
                // 현재 노드까지 오는데 걸린 가중치랑 이번에 추가할 노드까지 가는데 걸리는 가중치
                int next_weight = 가중치저장[node] + ints[1];

                // 더했는데 이미 그 노드까지 가는 시간이 더 짧게 걸리는게 저장되어 있으면 저장할 필요 없음
                if (가중치저장[ints[0]] < next_weight) {
                    continue;
                }

                // 아니라면 짧게걸리는 새로운 경로 찾은거니까 그 다음 탐색하기 위해 추가
                queue.offer(new int[]{ints[0], next_weight});
                // 마찬가지로 새로운 경로 더 짧은 경로 찾은거니까 업데이트
                가중치저장[ints[0]] = next_weight;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= V; ++i) {
            sb.append(가중치저장[i] != Integer.MAX_VALUE ? 가중치저장[i] : "INF").append("\n");
        }

        System.out.println(sb);
    }

    private static List<List<int[]>> getMatrix(int V, int E, BufferedReader br) throws IOException {
        List<List<int[]>> matrix = new ArrayList<>();
        for (int i = 1; i <= V +1; ++i) {
            matrix.add(new ArrayList<>());
        }

        // 방향 그래프임
        for (int i = 1; i <= E; ++i) {
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix.get(array[0]).add(new int[]{array[1], array[2]});
        }
        return matrix;
    }
}
