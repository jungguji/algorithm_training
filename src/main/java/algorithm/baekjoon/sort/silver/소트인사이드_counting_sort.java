package algorithm.baekjoon.sort.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 소트인사이드_counting_sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] bucket = new int[10];

        for (int i : array) {
            ++bucket[i];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = bucket.length-1; i >= 0; --i) {
            int count = bucket[i];
            while (count-- > 0) {
                sb.append(i);
            }
        }

        System.out.println(sb);
    }
}
