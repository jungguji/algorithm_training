package algorithm.baekjoon.structure.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class 국회의원_선거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();
        int initValue = 0;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());

            if (i == 0) {
                initValue = input;
            } else if (initValue < input){
                continue;
            }

            queue.offer(input);
        }

        int current = initValue;
        while (queue.size() != 1) {
            int peek = queue.peek();
            if (peek < current) {
                queue.poll();
            } else if (peek == current) {
                int lastIndex = queue.size()-1;

                queue.set(lastIndex, queue.get(lastIndex)-1);
                queue.set(0, ++current);
            }

            Collections.sort(queue);
        }

        System.out.println(current - initValue);
    }
}
