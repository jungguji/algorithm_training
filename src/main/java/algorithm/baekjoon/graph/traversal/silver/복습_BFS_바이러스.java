package algorithm.baekjoon.graph.traversal.silver;

import java.io.*;
import java.util.*;

public class 복습_BFS_바이러스 {

    private static List<List<Integer>> matrix = new ArrayList<>();
    private static boolean[] VISITED;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // init
            int 컴퓨터수 = Integer.parseInt(br.readLine());
            int 연결된쌍 = Integer.parseInt(br.readLine());

            VISITED = new boolean[컴퓨터수+1];
            for (int i = 0; i <= 컴퓨터수; ++i) {
                matrix.add(new ArrayList<>());
            }

            while (연결된쌍-- >0) {
                int[] array = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                matrix.get(array[0]).add(array[1]);
                matrix.get(array[1]).add(array[0]);
            }

            //solved
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(1);
            VISITED[1] = true;

            int sum = 0;
            while (!queue.isEmpty()) {
                Integer poll = queue.poll();

                for (Integer i : matrix.get(poll)) {
                    if (VISITED[i]) {
                        continue;
                    }

                    queue.offer(i);
                    VISITED[i] = true;
                    ++sum;
                }
            }

            System.out.println(sum);
        }
    }
}
