package algorithm.baekjoon.class3.serach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class DFS_BFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nmv = convertStringArrayToIntegerArray(br.readLine().split(" "));

        int n = nmv[0];
        int m = nmv[1];
        int v = nmv[2];

        boolean[][] networks = new boolean[n + 1][n + 1];

        while (m-- > 0) {
            int[] xy = convertStringArrayToIntegerArray(br.readLine().split(" "));

            networks[xy[0]][xy[1]] = true;
            networks[xy[1]][xy[0]] = true;
        }

        System.out.println(solution(n, v, networks));
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;

        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }

    public static String solution(int n, int v, boolean[][] networks) {
        boolean[] isVisit = new boolean[n + 1];

        StringBuilder answers = new StringBuilder();
        answers.append(dfs(networks, isVisit, n, v, new StringBuilder()))
                .append("\n")
                .append(bfs(networks, n, v, new StringBuilder()));

        return answers.toString();
    }

    public static String dfs(boolean[][] networks, boolean[] isVisit, int n, int v, StringBuilder sb) {
        sb.append(v).append(" ");
        isVisit[v] = true;

        for (int i = 1; i <= n; i++) {
            if (!networks[v][i] || isVisit[i]) {
                continue;
            }

            dfs(networks, isVisit, n, i, sb);
        }

        return sb.toString();
    }

    public static String bfs(boolean[][] networks, int n, int v, StringBuilder sb) {
        sb.append(v).append(" ");

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);

        boolean[] isVisit = new boolean[n + 1];
        isVisit[v] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int i = 1; i <=n ; i++) {
                if (!networks[current][i] || isVisit[i]) {
                    continue;
                }

                queue.offer(i);
                isVisit[i] = true;
                sb.append(i).append(" ");
            }
        }

        return sb.toString();
    }
}
