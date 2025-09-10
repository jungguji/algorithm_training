package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class 오세푸스문제0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Queue<Integer> queue = new LinkedList<>();

        int N = array[0];
        int K = array[1];

        IntStream.range(1, N+1).forEach(queue::offer);

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int i = 0;
        while (!queue.isEmpty()) {
            ++i;
            if (i % K == 0) {
                sb.append(queue.poll());

                if (!queue.isEmpty()) {
                    sb.append(", ");
                }
                continue;
            }

            queue.offer(queue.poll());
        }

        sb.append(">");
        System.out.println(sb);
    }
}
