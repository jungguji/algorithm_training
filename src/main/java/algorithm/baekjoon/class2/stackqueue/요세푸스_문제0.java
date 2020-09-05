package algorithm.baekjoon.class2.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 요세푸스_문제0 {
    public static void main(String[] args) throws IOException {
        int[] array = convertStringArrayToIntegerArray(getInputData(System.in).split(" "));

        int n = array[0];
        int m = array[1];

        LinkedList<Integer> queue = initQueue(n);

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int index = 0;
        while (true) {
            index += m - 1;

            while (index >= queue.size()) {
                index -= queue.size();
            }

            sb.append(queue.get(index));
            queue.remove(index);

            if (!queue.isEmpty()) {
                sb.append(", ");
            } else {
                break;
            }
        }

        sb.append(">");

        System.out.println(sb);
    }

    public static String getInputData(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            return br.readLine();
        }
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }

    private static LinkedList<Integer> initQueue(int n) {
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        return queue;
    }
}
