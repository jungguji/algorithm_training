package algorithm.baekjoon.class3.serach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 연결_요소의_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nm = convertStringArrayToIntegerArray(br.readLine().split(" "));
        int n = nm[0];
        int m = nm[1];

        boolean[][] graph = new boolean[n + 1][n + 1];
        while (m-- > 0) {
            int[] xy = convertStringArrayToIntegerArray(br.readLine().split(" "));

            graph[xy[0]][xy[1]] = true;
            graph[xy[1]][xy[0]] = true;
        }

        int answer = 0;

        boolean[] isVisit = new boolean[n + 1];
        for (int i = 1; i < graph.length; i++) {
            if (!isVisit[i]) {
                answer += bfs(isVisit, graph, i);
            }
        }

        System.out.println(answer);
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }

    private static int bfs(boolean[] isVisit, boolean[][] graph, int startIndex) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startIndex);
        isVisit[startIndex] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (int i = 1; i < isVisit.length; i++) {
                if (isVisit[i]) {
                    continue;
                }

                if (graph[x][i]) {
                    queue.offer(i);
                    isVisit[i] = true;
                }
            }
        }

        return 1;
    }
}
