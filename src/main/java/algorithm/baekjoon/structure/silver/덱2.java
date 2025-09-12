package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class 덱2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        Deque<Integer> dq = new ArrayDeque<>();
        while (N-- > 0) {
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            switch (array[0]) {
                case 1:
                    dq.offerFirst(array[1]);
                    break;
                case 2:
                    dq.offerLast(array[1]);
                    break;
                case 3:
                    sb.append(dq.isEmpty() ? -1 : dq.pollFirst());
                    break;
                case 4:
                    sb.append(dq.isEmpty() ? -1 : dq.pollLast());
                    break;
                case 5:
                    sb.append(dq.size());
                    break;
                case 6:
                    sb.append(dq.isEmpty() ? 1 : 0);
                    break;
                case 7:
                    sb.append(dq.isEmpty() ? -1 : dq.peekFirst());
                    break;
                case 8:
                    sb.append(dq.isEmpty() ? -1 : dq.peekLast());
                    break;
            }

            if (array[0] != 1 && array[0] != 2) {
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
