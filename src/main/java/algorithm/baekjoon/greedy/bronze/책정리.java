package algorithm.baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 책정리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] boxs = convertStringArrayToIntegerArray(br.readLine().split(" "));
        int[] books = convertStringArrayToIntegerArray(br.readLine().split(" "));

        int answer = 0;

        LinkedList<Integer> queue = new LinkedList<>();
        for (int box : boxs) {
            queue.offer(box);
        }

        int i = 0;
        while (true) {
            if (queue.isEmpty() || i >= books.length) {
                break;
            }

            if (queue.peek() >= books[i]) {
                queue.set(0, queue.peek() - books[i]);
                ++i;
            } else {
                answer += queue.poll();
            }
        }

        while (!queue.isEmpty()) {
            answer += queue.poll();
        }

        System.out.println(answer);
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }
}
