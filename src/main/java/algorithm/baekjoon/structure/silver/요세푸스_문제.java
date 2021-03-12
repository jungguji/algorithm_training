package algorithm.baekjoon.structure.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 요세푸스_문제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nk = convertStringArrayToIntegerArray(br.readLine().split(" "));

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= nk[0]; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int index = 1;
        while (!queue.isEmpty()) {

            if (index == nk[1]) {
                sb.append(queue.poll());
                index = 1;

                if (!queue.isEmpty()) {
                    sb.append(", ");
                }
            } else {
                queue.offer(queue.poll());
                ++index;
            }
        }
        sb.append(">");

        System.out.println(sb);
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
