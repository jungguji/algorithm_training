package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
1 2 3 4 5
= 1

5 2 3 4
= 4

5 2 3
= 5

3 2
= 3



 */
public class 풍선터뜨리기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        StringBuilder sb = new StringBuilder();
        Deque<int[]> dq = new ArrayDeque<>();
        for (int i = 1; i<=N; ++i) {
            dq.offer(new int[]{i, array[i-1]});
        }

        while (!dq.isEmpty()) {
            int[] poll = dq.poll();
            sb.append(poll[0]).append(" ");

            if (dq.isEmpty()) {
                break;
            }

            int number = poll[1];

            if (number > 0) {
                while (--number > 0) {
                    dq.offerLast(dq.pollFirst());
                }
            } else {
                while (number++ < 0) {
                    dq.offerFirst(dq.pollLast());
                }
            }
        }

        System.out.println(sb);
    }
}
