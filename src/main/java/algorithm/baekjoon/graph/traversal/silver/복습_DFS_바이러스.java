package algorithm.baekjoon.graph.traversal.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 복습_DFS_바이러스 {

    private static List<List<Integer>> matrix = new ArrayList<>();
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int 컴퓨터수 = Integer.parseInt(br.readLine());
            int 쌍수 = Integer.parseInt(br.readLine());

            // 초기화
            for (int i = 0; i <= 컴퓨터수; ++i) {
                matrix.add(new ArrayList<>());
            }

            // 인접리스트 생성
            while (쌍수-- > 0) {
                int[] array = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                matrix.get(array[0]).add(array[1]);
                matrix.get(array[1]).add(array[0]);
            }

            dfs(1, new boolean[컴퓨터수+1]);
            System.out.println(--answer);
        }
    }

    private static void dfs(int node, boolean[] visited) {
        if (visited[node]) {
            return;
        }

        visited[node] = true;
        ++answer;
        for (Integer i : matrix.get(node)) {
            dfs(i, visited);
        }
    }
}
