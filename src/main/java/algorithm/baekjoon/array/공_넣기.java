package algorithm.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 공_넣기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] bucket = new int[NM[0]+1];

        for (int i = 0; i < NM[1]; ++i) {
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = array[0]; j <= array[1]; ++j) {
                bucket[j] = array[2];
            }
        }

        StringBuilder sb = new StringBuilder();
        Arrays.stream(bucket, 1, bucket.length)
                .forEach(i -> sb.append(i).append(" "));

        System.out.println(sb);
    }
}
