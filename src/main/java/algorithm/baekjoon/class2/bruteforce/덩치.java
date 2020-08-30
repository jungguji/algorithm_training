package algorithm.baekjoon.class2.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 덩치 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = Integer.parseInt(br.readLine());

            int[] rank = initRankArray(amount);

            List<int[]> list = setWeightAndHeight(amount, br);

            setRank(list, rank);

            for (int i : rank) {
                System.out.print(i + " ");
            }
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

    private static int[] initRankArray(int amount) {
        int[] rank = new int[amount];

        for (int i = 0; i < amount; i++) {
            rank[i] = 1;
        }

        return rank;
    }

    private static List<int[]> setWeightAndHeight(int amount, BufferedReader br) throws IOException {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            int[] weightAndHeight = convertStringArrayToIntegerArray(br.readLine().split(" "));

            list.add(weightAndHeight);
        }

        return list;
    }

    private static void setRank(List<int[]> list, int[] rank) {
        for (int i = 0; i < list.size(); i++) {
            int[] array = list.get(i);

            for (int j = i + 1; j < list.size(); j++) {
                int[] nextArray = list.get(j);

                if (array[0] < nextArray[0] && array[1] < nextArray[1]) {
                    rank[i]++;
                } else if (array[0] > nextArray[0] && array[1] > nextArray[1]) {
                    rank[j]++;
                }
            }
        }
    }
}
