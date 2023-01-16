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

    private static boolean dfs(int n, int x, int y, int[][] graph, boolean[][] visited) {
        int jump = graph[y][x];

        if (x + jump > n || y + jump > n) {
            return false;
        }

        if (x == n-1 && y == n-1) {
            return true;
        }

        if (visited[y][x]) {
            return false;
        }

        visited[y][x] = true;



        if (dfs(n, x+jump,y, graph, visited)) {
            return true;
        }

        if (dfs(n, x,y+jump, graph, visited)) {
            return true;
        }

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
