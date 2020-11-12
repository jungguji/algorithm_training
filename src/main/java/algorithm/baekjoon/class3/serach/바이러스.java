package algorithm.baekjoon.class3.serach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class 바이러스 {
    private static final int INFECTION_HOST = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        boolean[][] networks = new boolean[n + 1][n + 1];
        boolean[] isVisit = new boolean[n + 1];

        while (m-- > 0) {
            int[] xy = convertStringArrayToIntegerArray(br.readLine().split(" "));

            networks[xy[0]][xy[1]] = true;
            networks[xy[1]][xy[0]] = true;
        }

        int answer = getInfectionComputerCount(networks, isVisit);
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

    public static int getInfectionComputerCount(boolean[][] networks, boolean[] isVisit) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(INFECTION_HOST);
        isVisit[INFECTION_HOST] = true;

        int count = 0;

        while (!queue.isEmpty()) {
            int currentComputer = queue.poll();

            for (int i = 1; i < networks.length; i++) {
                if (isVisit[i]) {
                    continue;
                }

                if (networks[currentComputer][i]) {
                    queue.offer(i);
                    isVisit[i] = true;
                    ++count;
                }
            }
        }

        return count;
    }
}