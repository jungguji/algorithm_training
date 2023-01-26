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
            int h = map[0].length;
            int w = map.length;

            boolean[][] visited = new boolean[h][w];

            for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                    if (dfs(j, i, map, visited)) {
                        ++answer;
                    }
                }
            }

            bw.write(answer + "\n");
        }

        bw.flush();
    }

    private static int[][] getMap(BufferedReader br, String input) throws IOException {
        int[] rectangle = convertStringArrayToIntegerArray(input.split(" "));

        int h = rectangle[0];
        int w = rectangle[1];

        int[][] map = new int[h][w];
        for (int i = 0; i < h; ++i) {
            map[i] = convertStringArrayToIntegerArray(br.readLine().split(" "));
        }

        return map;
    }

    public static boolean dfs(int x, int y, int[][] map, boolean[][] visited) {
        int w = map.length;
        int h = map[0].length;

        if (x == w || y == h) {
            return false;
        }

        if (visited[y][x]) {
            return false;
        }
        System.out.printf("%d %d\n", y, x);

        if (map[y][x] == 0) {
            return false;
        }

        visited[y][x] = true;

        if (x == w-1 || map[y][x+1] == 1) {
            dfs(x+1, y, map, visited);
        } else if (y == h - 1 || map[y+1][x] == 1) {
            dfs(x, y+1, map, visited);
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
