package algorithm.baekjoon.sort.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기3_카운팅정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int max = 0;
        int[] arr = new int[N+1];
        while (N-- > 0) {
            arr[N] = Integer.parseInt(br.readLine());
            max = Math.max(arr[N], max);
        }

        int[] bucket = new int[max+1];

        for (int i : arr) {
            ++bucket[i];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < bucket.length; ++i) {
            int count = bucket[i];
            while (count-- > 0) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
