package algorithm.baekjoon.dfs.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 바닥_장식 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nm = convertStringArrayToIntegerArray(br.readLine().split(" "));

        int n = nm[0];
        int m = nm[1];
        char[][] array = getArray(br, n, m);

        int answer = solution(n, m, array);

        System.out.println(answer);
    }

    private static char[][] getArray(BufferedReader br, int n, int m) throws IOException {
        char[][] array = new char[n][m];

        for (int i = 0; i < n; ++i) {
            array[i] = br.readLine().toCharArray();
        }
        return array;
    }

    private static int solution(int n, int m, char[][] array) {
        int answer = 0;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (dfs(j, i, array, visited)) {
                    ++answer;
                }
            }
        }
        return answer;
    }

    private static boolean dfs(int x, int y, char[][] array, boolean[][] visited) {
        int n = array.length;
        int m = array[0].length;

        if (x == m || y == n) {
            return false;
        }

        if (visited[y][x]) {
            return false;
        }

        visited[y][x] = true;

        if (array[y][x] == '-' && (x == m - 1 || array[y][x + 1] == '-')) {
            dfs(x + 1, y, array, visited);
        } else if (array[y][x] == '|' && (y == n - 1 || array[y + 1][x] == '|')) {
            dfs(x, y + 1, array, visited);
        }

        return true;
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
