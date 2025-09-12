package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class queuestack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] array = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int[] init = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        br.readLine();
        int[] array1 = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == 0) {
                dq.offer(init[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : array1) {
            dq.offerFirst(i);
            sb.append(dq.pollLast()).append(" ");
        }

        System.out.println(sb);
    }
}
