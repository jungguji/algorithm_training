package algorithm.baekjoon.dfs.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 점프왕_쩰리_Small {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] graph = new int[n][n];

        for (int i = 0; i < n; ++i) {
            graph[i] = convertStringArrayToIntegerArray(br.readLine().split(" "));
        }

        String answer = "Hing";

        boolean[][] visited = new boolean[n][n];

        if (dfs(n, 0, 0, graph, visited)) {
            answer = "HaruHaru";
        }

        System.out.println(answer);
    }

    /**
     * 종료 조건 : 1. 점프 할 위치가 배열을 벗어남
     * 2. 이미 시도한 위치
     * 3. 도착지에 도착함
     *
     * @param n
     * @param x
     * @param y
     * @param graph
     * @param visited
     * @return
     */
    private static boolean dfs(int n, int x, int y, int[][] graph, boolean[][] visited) {
        int jump = graph[y][x];

        if (jump == 0) {
            return false;
        }

        if (visited[y][x]) {
            return false;
        }

        if (x == n-1 && y == n-1) {
            return true;
        }

        if (x + jump < n) {
            if (dfs(n, x+jump,y, graph, visited)) {
                return true;
            }
        }

        if (y + jump < n) {
            if (dfs(n, x,y+jump, graph, visited)) {
                return true;
            }
        }

        visited[y][x] = true;

        return false;
    }



    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }
}
