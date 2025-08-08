package algorithm.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 공_바꾸기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int N = NM[0];
        int M = NM[1];

        int[] arr = new int[N +1];
        for (int i = 1; i <= N; ++i) {
            arr[i] = i;
        }

        while (M-- > 0) {
            int[] ij = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int temp = arr[ij[0]];
            arr[ij[0]] = arr[ij[1]];
            arr[ij[1]] = temp;
        }

        Arrays.stream(arr, 1, arr.length)
                .forEach(i-> System.out.printf(i + " "));
    }
}
