package algorithm.baekjoon.graph.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class dfs_bfs {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] NMV = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int N = NMV[0];
            int M = NMV[1];
            int V = NMV[2];

            Map<Integer, List<Integer>> map = new HashMap<>();
            while (M-- > 0) {
                int[] nodeAndEdge = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                int node = nodeAndEdge[0];
                int relationNode = nodeAndEdge[1];
                List<Integer> list = map.getOrDefault(node, new ArrayList<>());
                list.add(relationNode);
                Collections.sort(list);
                map.put(node, list);

                List<Integer> list1 = map.getOrDefault(relationNode, new ArrayList<>());
                list1.add(node);
                Collections.sort(list1);
                map.put(relationNode, list1);
            }

            dfs(map, new boolean[N + 1], V);
            System.out.println();
            bfs(map, new boolean[N + 1], V);
        }
    }

    private static void dfs(Map<Integer, List<Integer>> adjacencyList, boolean[] visited, int node) {

        if (visited[node]) {
            return;
        }

        visited[node] = true;
        System.out.printf("%d ", node);

        List<Integer> integers = adjacencyList.getOrDefault(node, new ArrayList<>());

        for (Integer integer : integers) {
            dfs(adjacencyList, visited, integer);
        }
    }

    private static void bfs(Map<Integer, List<Integer>> adjacencyList, boolean[] visited, int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Integer i = queue.poll();
            if (visited[i]) {
                continue;
            }

            System.out.printf("%d ", i);

            visited[i] = true;

            List<Integer> integers = adjacencyList.getOrDefault(i, new ArrayList<>());
            queue.addAll(integers);
        }
    }
}
