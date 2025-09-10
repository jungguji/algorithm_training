package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        for (int i=1; i <= N; ++i) {
            q.offer(i);
        }

        int answer = 0;
        while (!q.isEmpty()) {
            answer = q.poll();

            if (!q.isEmpty()) {
                q.offer(q.poll());
            }
        }

        System.out.println(answer);
    }
}
