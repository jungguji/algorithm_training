package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class queuestack_복습_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] A = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] B = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        br.readLine();

        int[] C = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // solved

        // 스택은 어차피 의미 없으니까 A만큼 반복하지 않기위해
        // 큐에 해당하는 초기값만 저장
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < A.length; ++i) {
            if (A[i] == 0) {
                deque.offer(B[i]);
            }
        }

        // 큐만 있으면
        // 새로운애를 맨 앞에 추가하고
        // 맨마지막애를 빼면
        // 한칸씩 뒤로 밀리는거랑 똑같음
        StringBuilder sb = new StringBuilder();
        for (int i : C) {
            deque.offerFirst(i);
            sb.append(deque.pollLast()).append(" ");
        }

        System.out.println(sb);
    }
}
