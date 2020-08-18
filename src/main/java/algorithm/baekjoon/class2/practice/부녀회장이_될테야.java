package algorithm.baekjoon.class2.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부녀회장이_될테야 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());

            for (int i = 0; i < amount; i++) {
                int layer = Integer.parseInt(br.readLine()) + 1;
                int room = Integer.parseInt(br.readLine());

                int[][] apt = initApt(layer, room);

                setAptMoveIn(layer, room, apt);

                System.out.println(apt[layer - 1][room - 1]);
            }
        }
    }

    private static int[][] initApt(int layer, int room) {
        int[][] apt = new int[layer][room];

        for (int i = 0; i < room; i++) {
            apt[0][i] = i + 1;
        }

        for (int i = 0; i < layer; i++) {
            apt[i][0] = 1;
        }

        return apt;
    }

    private static void setAptMoveIn(int layer, int room, int[][] apt) {
        for (int i = 1; i < layer; i++) {
            for (int j = 1; j < room; j++) {
                apt[i][j] = apt[i-1][j] + apt[i][j-1];
            }
        }
    }
}
