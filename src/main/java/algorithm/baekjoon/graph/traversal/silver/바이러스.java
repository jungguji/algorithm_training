package algorithm.baekjoon.graph.traversal.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 바이러스 {
    private static int sum = 0;
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int 컴퓨터수 = Integer.parseInt(br.readLine());
            int 연결되어있는컴퓨터수 = Integer.parseInt(br.readLine());

            Map<Integer, List<Integer>> graph = new HashMap<>();

            while (연결되어있는컴퓨터수-- > 0) {
                int[] nodes = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                List<Integer> list = graph.getOrDefault(nodes[0], new ArrayList<>());
                list.add(nodes[1]);
                graph.put(nodes[0], list);

                List<Integer> list1 = graph.getOrDefault(nodes[1], new ArrayList<>());
                list1.add(nodes[0]);
                graph.put(nodes[1], list1);
            }

            dfs(graph, new boolean[컴퓨터수 + 1], 1);
            System.out.println(sum);
        }
    }

    private static void dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int node) {

//        // base case
//        if (visited[node]) {
//            return;
//        }

        visited[node] = true;

        List<Integer> integers = graph.getOrDefault(node, new ArrayList<>());
        for (Integer integer : integers) {
            if (!visited[integer]) {
                ++sum;
                dfs(graph, visited, integer);
            }
        }
    }
}
