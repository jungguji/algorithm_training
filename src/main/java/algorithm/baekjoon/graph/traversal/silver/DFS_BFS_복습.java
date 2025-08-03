package algorithm.baekjoon.graph.traversal.silver;

import java.io.*;
import java.util.*;

public class DFS_BFS_복습 {
    private static List<List<Integer>> matrix = new ArrayList<>();
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int V = array[0];
            int E = array[1];
            int start_node = array[2];

            for (int i = 0; i <= V; ++i) {
                matrix.add(new ArrayList<>());
            }

            for (int i = 0; i < E; ++i) {
                int[] from_to = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                matrix.get(from_to[0]).add(from_to[1]);
                matrix.get(from_to[1]).add(from_to[0]);
            }

            for (List<Integer> integers : matrix) {
                Collections.sort(integers);
            }

            sb.append(start_node).append(" ");
            boolean[] visited = new boolean[V+1];
            visited[start_node] = true;

            dfs(start_node, visited);
            sb.append("\n");

            bfs(start_node, new boolean[V+1]);

            System.out.println(sb);
        }
    }

    private static void dfs(int start, boolean[] visited) {
        for (Integer i : matrix.get(start)) {
            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            sb.append(i).append(" ");
            dfs(i, visited);
        }
    }

    private static void bfs(int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        sb.append(start).append(" ");

        while (!queue.isEmpty()) {
            Integer node = queue.poll();

            for (Integer i : matrix.get(node)) {
                if (visited[i]) {
                    continue;
                }

                queue.offer(i);
                visited[i] = true;
                sb.append(i).append(" ");
            }
        }
    }
}
