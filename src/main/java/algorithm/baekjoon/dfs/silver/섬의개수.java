package algorithm.baekjoon.dfs.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 섬의개수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;

        String input = "";
        while (!((input = br.readLine()).equals("0 0"))) {
            int[][] map = getMap(br, input);
            int w = map[0].length;
            int h = map.length;

            boolean[][] visited = new boolean[h][w];

            for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                    if (dfs(j, i, map, visited)) {
                        ++answer;
                    }
                }
            }

            bw.write(answer + "\n");
            answer = 0;
        }

        bw.flush();
    }

    private static int[][] getMap(BufferedReader br, String input) throws IOException {
        int[] rectangle = convertStringArrayToIntegerArray(input.split(" "));

        int w = rectangle[0];
        int h = rectangle[1];

        int[][] map = new int[h][w];
        for (int i = 0; i < h; ++i) {
            map[i] = convertStringArrayToIntegerArray(br.readLine().split(" "));
        }

        return map;
    }

    public static boolean dfs(int x, int y, int[][] map, boolean[][] visited) {
        int w = map[0].length;
        int h = map.length;

        if (validation(x, y, map, visited, w, h)) {
            return false;
        }

        visited[y][x] = true;

        moveRight(x, y, map, visited, w);
        moveDown(x, y, map, visited, w, h);
        moveUp(x, y, map, visited, w);

        return true;
    }

    private static boolean validation(int x, int y, int[][] map, boolean[][] visited, int w, int h) {
        if (x == w || y == h) {
            return true;
        }

        if (visited[y][x]) {
            return true;
        }

        if (map[y][x] == 0) {
            return true;
        }

        return false;
    }

    private static void moveRight(int x, int y, int[][] map, boolean[][] visited, int w) {
        // 오른쪽으로
        if (x == w-1 || map[y][x+1] == 1) {
            dfs(x+1, y, map, visited);
        }

        // 왼쪽으로
        if (x > 0 && map[y][x-1] == 1) {
            dfs(x-1, y, map, visited);
        }
    }

    private static void moveDown(int x, int y, int[][] map, boolean[][] visited, int w, int h) {
        // 아래로
        if (y == h-1 || map[y+1][x] == 1) {
            dfs(x, y+1, map, visited);
        }

        // 왼쪽 아래 대각선으로
        if ((x > 0 && y < h-1 && map[y+1][x-1] == 1)) {
            dfs(x-1, y+1, map, visited);
        }

        // 오른쪽 아래 대각선으로
        if ((x < w-1 && y < h-1 && map[y+1][x+1] == 1)) {
            dfs(x+1, y+1, map, visited);
        }
    }

    private static void moveUp(int x, int y, int[][] map, boolean[][] visited, int w) {
        // 위쪽으로
        if (y > 0 && map[y-1][x] == 1) {
            dfs(x, y-1, map, visited);
        }

        // 왼쪽 위 대각선으로
        if ((x > 0 && y > 0 && map[y-1][x-1] == 1)) {
            dfs(x-1, y-1, map, visited);
        }

        // 오른쪽 위 대각선으로
        if ((x < w-1 && y > 0 && map[y-1][x+1] == 1)) {
            dfs(x+1, y-1, map, visited);
        }
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
