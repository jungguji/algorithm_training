package algorithm.baekjoon.sort.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 좌표압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] position = new int[array.length][3];

        // 원래 배열의 순서 저장
        for (int i = 0; i < array.length; ++i) {
            position[i][0] = array[i];
            position[i][1] = i;
        }

        // 배열 값 순서대로 정렬
        Arrays.sort(position, Comparator.comparingInt((int[] p) -> p[0]));

        int index=0;
        position[0][2] = index;

        // 값 순서대로 정렬된 순서 저장
        for (int i = 1; i < array.length; ++i) {
            if (position[i-1][0] != position[i][0]) {
                ++index;
            }

            position[i][2] = index;
        }

        // 원래 순서대로 다시 정렬
        Arrays.sort(position, Comparator.comparingInt((int[] p) -> p[1]));

        StringBuilder sb = new StringBuilder();
        for (int[] ints : position) {
            sb.append(ints[2]).append(" ");
        }

        System.out.println(sb);
    }
}
